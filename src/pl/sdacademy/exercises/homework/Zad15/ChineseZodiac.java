package pl.sdacademy.exercises.homework.Zad15;

public class ChineseZodiac {
    private int year;

    public ChineseZodiac(int year) {
        this.year = year;
        zodiac();
    }

    private void zodiac() {
        int cycle = Math.abs(1900 - year);
        if (year >= 1900) {
            result(cycle%12);
        }else {
            if (cycle%12!=0) {
                result(12 - cycle % 12);
            }else {
                result(0);
            }
        }
    }

    private void result(int i) {
        if (i == 0) {
            System.out.println("Twój zna to Szczur");
        } else if (i == 1) {
            System.out.println("Twój zna to Bawół");
        } else if (i == 2) {
            System.out.println("Twój zna to Tygrys");
        } else if (i == 3) {
            System.out.println("Twój zna to Królik");
        } else if (i == 4) {
            System.out.println("Twój zna to Smok");
        } else if (i == 5) {
            System.out.println("Twój zna to Wąż");
        } else if (i == 6) {
            System.out.println("Twój zna to Koń");
        } else if (i == 7) {
            System.out.println("Twój zna to Koza/Owca");
        } else if (i == 8) {
            System.out.println("Twój zna to Małpa");
        } else if (i == 9) {
            System.out.println("Twój zna to Kogut");
        } else if (i == 10) {
            System.out.println("Twój zna to Pies");
        } else if (i == 11) {
            System.out.println("Twój zna to Świnia");
        }

    }
}
