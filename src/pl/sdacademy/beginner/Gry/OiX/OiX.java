package pl.sdacademy.beginner.Gry.OiX;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class OiX extends Game implements Save{
    /**
     * Główny program gry.
     * @author zajc.
     */
    private OiX(){

    }
    private static char table[][] = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};
    private static char znak1 = 'X';
    private static char znak2 = 'O';
    private static boolean computer = true;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.print("Czy wczytać poprzedni stan gry?");
        if (Save.czyZapisac()) {
            wczytaj(Save.plik());
            gra();
            tabela();
        } else {
            if (iloscGraczy()) {
                rospoczecieZnak();
                do {
                    createTable();
                    while (!wynikComp()) {
                        tabela();
                        if (computer) {
                            ruchAI();
                        } else {
                            ruchGracz();
                        }
                    }
                    tabela();
                    System.out.println("Czy powtozyc rozgryfke?");
                } while (Save.czyZapisac());
            } else {
                rospoczecieZnak();
                do {
                    createTable();
                    gra();
                } while (Save.czyZapisac());
            }
        }


    }
    private static void gra() throws IOException {
        while (!wynikGracz()) {
            tabela();
            ruchGracz();
            System.out.print("Czy zapisać stan gry?");
            if (Save.czyZapisac()) {
                Save.zapis(Save.plik(), table, computer);
            }
        }
        tabela();
        System.out.println("Czy powtozyc rozgryfke?");
    }


    private static void wczytaj(String plik) throws IOException {
        Scanner scanner = new Scanner(new File(plik));
        String wiersz = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                wiersz = scanner.nextLine();
                table[i][j] = wiersz.charAt(0);
            }
        }
        wiersz = scanner.nextLine();
        if (wiersz.equals("true")) {
            computer = true;
        } else {
            computer = false;
        }
    }



    private static void rospoczecieZnak() {
        boolean correct = false;
        System.out.println("Podaj który znak zaczyna (X lub O): ");
        while (!correct) {
            String coord = input.next();
            if (coord.length() != 1) {
                System.out.println("Nieprawidlowy znak (moze byc X lub O)");
            } else if (coord.charAt(0) != 'X' &&
                    coord.charAt(0) != 'O') {
                System.out.println("Nieprawidlowy znak (moze byc X lub O)");
            } else {
                if (coord.charAt(0) == 'X') {
                    znak1 = 'X';
                    znak2 = 'O';
                    correct = true;
                } else {
                    znak1 = 'O';
                    znak2 = 'X';
                    correct = true;
                }
            }
        }
    }

    private static void tabela() {
        System.out.println();
        System.out.println();
        System.out.println("    1 2 3");
        System.out.println("a   " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
        System.out.println("b   " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("c   " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);

    }
    private static boolean wynikGracz() {
        if ((table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] != ' ') ||
                (table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] != ' ') ||
                (table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] != ' ') ||
                (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] != ' ') ||
                (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] != ' ') ||
                (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] != ' ') ||
                (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != ' ') ||
                (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != ' ')) {
            if (computer) {
                System.out.println("Wygral Gracz 2!");
            } else {
                System.out.println("Wygral Gracz 1!");
            }
            return true;
        }
        if (table[0][0] != ' ' && table[1][0] != ' ' && table[2][0] != ' ' &&
                table[0][1] != ' ' && table[1][1] != ' ' && table[2][1] != ' ' &&
                table[0][2] != ' ' && table[1][2] != ' ' && table[2][2] != ' ') {
            System.out.println("Remis!");
            return true;
        }

        computer = !computer;
        return false;
    }

    private static boolean wynikComp() {
        if ((table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] != ' ') ||
                (table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] != ' ') ||
                (table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] != ' ') ||
                (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] != ' ') ||
                (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] != ' ') ||
                (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] != ' ') ||
                (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != ' ') ||
                (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != ' ')) {
            if (computer) {
                System.out.println("Wygral komputer!");
            } else {
                System.out.println("Brawo, wygrales!");
            }
            return true;
        }
        if (table[0][0] != ' ' && table[1][0] != ' ' && table[2][0] != ' ' &&
                table[0][1] != ' ' && table[1][1] != ' ' && table[2][1] != ' ' &&
                table[0][2] != ' ' && table[1][2] != ' ' && table[2][2] != ' ') {
            System.out.println("Remis!");
            return true;
        }

        computer = !computer;
        return false;
    }

    private static void ruchGracz() {
        boolean correct = false;
        System.out.println("Podaj wspolrzedne dla kolka (np: a1): ");
        while (!correct) {
            String coord = input.next();
            if (coord.length() != 2) {
                System.out.println("Nieprawidlowe wspolrzedne");
            } else if (coord.charAt(0) != 'a' &&
                    coord.charAt(0) != 'b' &&
                    coord.charAt(0) != 'c') {
                System.out.println("Nieprawidlowy poczatek wspolrzednych (moze byc a, b lub c)");
            } else if (coord.charAt(1) != '1' &&
                    coord.charAt(1) != '2' &&
                    coord.charAt(1) != '3') {
                System.out.println("Nieprawidlowy koniec wspolrzednych (moze byc 1, 2 lub 3)");
            } else {
                int a, b;
                if (coord.charAt(0) == 'a') {
                    a = 0;
                } else if (coord.charAt(0) == 'b') {
                    a = 1;
                } else {
                    a = 2;
                }
                if (coord.charAt(1) == '1') {
                    b = 0;
                } else if (coord.charAt(1) == '2') {
                    b = 1;
                } else {
                    b = 2;
                }
                if (table[a][b] != ' ') {
                    System.out.println("To pole jest już zajęte");
                } else if (computer) {
                    table[a][b] = znak2;
                    correct = true;
                } else {
                    table[a][b] = znak1;
                    correct = true;
                }
            }
        }
    }

    private static void ruchAI() {
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == znak2 && table[i][1] == znak2 && table[i][2] == ' ') {
                table[i][2] = znak2;
                return;
            }
            if (table[i][0] == znak2 && table[i][2] == znak2 && table[i][1] == ' ') {
                table[i][1] = znak2;
                return;
            }
            if (table[i][2] == znak2 && table[i][1] == znak2 && table[i][0] == ' ') {
                table[i][0] = znak2;
                return;
            }
            if (table[0][i] == znak2 && table[1][i] == znak2 && table[2][i] == ' ') {
                table[2][i] = znak2;
                return;
            }
            if (table[0][i] == znak2 && table[2][i] == znak2 && table[1][i] == ' ') {
                table[1][i] = znak2;
                return;
            }
            if (table[2][i] == znak2 && table[1][i] == znak2 && table[0][i] == ' ') {
                table[0][i] = znak2;
                return;
            }
        }
        if (table[0][0] == znak2 && table[1][1] == znak2 && table[2][2] == ' ') {
            table[2][2] = znak2;
            return;
        }
        if (table[0][0] == znak2 && table[2][2] == znak2 && table[1][1] == ' ') {
            table[1][1] = znak2;
            return;
        }
        if (table[2][2] == znak2 && table[1][1] == znak2 && table[0][0] == ' ') {
            table[0][0] = znak2;
            return;
        }
        if (table[0][2] == znak2 && table[1][1] == znak2 && table[2][0] == ' ') {
            table[2][0] = znak2;
            return;
        }
        if (table[0][2] == znak2 && table[2][0] == znak2 && table[1][1] == ' ') {
            table[1][1] = znak2;
            return;
        }
        if (table[2][0] == znak2 && table[1][1] == znak2 && table[0][2] == ' ') {
            table[0][2] = znak2;
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == znak1 && table[i][1] == znak1 && table[i][2] == ' ') {
                table[i][2] = znak2;
                return;
            }
            if (table[i][0] == znak1 && table[i][2] == znak1 && table[i][1] == ' ') {
                table[i][1] = znak2;
                return;
            }
            if (table[i][2] == znak1 && table[i][1] == znak1 && table[i][0] == ' ') {
                table[i][0] = znak2;
                return;
            }
            if (table[0][i] == znak1 && table[1][i] == znak1 && table[2][i] == ' ') {
                table[2][i] = znak2;
                return;
            }
            if (table[0][i] == znak1 && table[2][i] == znak1 && table[1][i] == ' ') {
                table[1][i] = znak2;
                return;
            }
            if (table[2][i] == znak1 && table[1][i] == znak1 && table[0][i] == ' ') {
                table[0][i] = znak2;
                return;
            }
        }
        if (table[0][0] == znak1 && table[1][1] == znak1 && table[2][2] == ' ') {
            table[2][2] = znak2;
            return;
        }
        if (table[0][0] == znak1 && table[2][2] == znak1 && table[1][1] == ' ') {
            table[1][1] = znak2;
            return;
        }
        if (table[2][2] == znak1 && table[1][1] == znak1 && table[0][0] == ' ') {
            table[0][0] = znak2;
            return;
        }
        if (table[0][2] == znak1 && table[1][1] == znak1 && table[2][0] == ' ') {
            table[2][0] = znak2;
            return;
        }
        if (table[0][2] == znak1 && table[2][0] == znak1 && table[1][1] == ' ') {
            table[1][1] = znak2;
            return;
        }
        if (table[2][0] == znak1 && table[1][1] == znak1 && table[0][2] == ' ') {
            table[0][2] = znak2;
            return;
        }
        boolean done = false;
        Random r = new Random();
        int a, b;
        while (!done) {
            a = r.nextInt(3);
            b = r.nextInt(3);
            if (table[a][b] == ' ') {
                table[a][b] = znak2;
                done = true;
            }
        }
    }

}
