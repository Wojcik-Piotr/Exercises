package pl.sdacademy.beginner.day15.Literacja;

class RabbitsSimulate {
    private static int rabbits;
    private static int deadRabbids;
    private static int time;

    static int getRabbits() {
        return rabbits;
    }

    static int getDeadRabbids() {
        return deadRabbids;
    }

    static int getTime() {
        return time;
    }

    static void simulate(int maleCount, int femaleCount, long limit) {
        int[][] rabbitsMale = new int[8][12];
        int[][] rabbitsFemale = new int[8][12];
        rabbitsFemale[0][0] = femaleCount;
        rabbitsMale[0][0] = maleCount;
        while (limit > rabbits) {
            int temp = breeding(rabbitsFemale);
            aged(rabbitsMale, temp * 5);
            aged(rabbitsFemale, temp * 14);
            rabbits = count(rabbitsMale, rabbitsFemale);
            deadRabbids = deadCount(rabbitsMale, rabbitsFemale);
            time++;
        }
    }

    private static void aged(int[][] rabbitsTab, int rabbits) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 11; j >= 0; j--) {
                if (j == 0 && i != 0) {
                    rabbitsTab[i][j] += rabbitsTab[i - 1][11];
                } else if (i == 0 && j == 0) {
                    rabbitsTab[i][j] = rabbits;
                } else {
                    rabbitsTab[i][j] = rabbitsTab[i][j - 1];
                    rabbitsTab[i][j - 1] = 0;
                }
            }
        }
    }

    private static int breeding(int[][] rabbitTab) {
        int rabbits = 0;
        for (int i = 6; i >= 0; i--) {
            for (int j = 11; j >= 0; j--) {
                if (i == 0 && j <= 4) {

                } else {
                    rabbits += rabbitTab[i][j];
                }
            }
        }
        return rabbits;
    }

    private static int count(int[][] male, int[][] female) {
        int rabbits = 0;
        for (int i = 6; i >= 0; i--) {
            for (int j = 11; j >= 0; j--) {
                rabbits += male[i][j] + female[i][j];
            }
        }
        return rabbits;
    }

    private static int deadCount(int[][] male, int[][] female) {
        int rabbits = 0;
        for (int i = 11; i >= 0; i--) {
            rabbits += male[7][i] + female[7][i];
        }
        return rabbits;
    }
}

