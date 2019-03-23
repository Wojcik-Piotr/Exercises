package pl.sdacademy.beginner.Gry.KPN;

import javax.lang.model.SourceVersion;
import javax.tools.Tool;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Set;
/*ctrl+alt+m - generuj metode
alt+enter - lista akcji
ctrl+alt+l - justowanie
ctrl+w - posział okna
 */

public class Game extends Player implements Logic, Tool {
    /*private final Player player =null;
    private  final Player player1 =null;

    protected Game(Player player,Player player1){
        this.player=player;
        this.player1=player1;
    }*/
    private GameTranslator translator;
    protected Game() {
    }

    public static void main(String[] args) {
        boolean restart = false;
        Player player = new Game();
        Player player1 = new Game();
        if (language()) {
            switch (Logic.ileGraczy()) {
                case 0:
                    while (!restart) {
                        System.out.println(score(player.aiPl(), player1.aiPl()));
                        restart = Logic.setRestart();
                    }
                    break;
                case 1:
                    while (!restart) {
                        System.out.println(score(player.movePl(), player1.aiPl()));
                        restart = Logic.setRestart();
                    }
                    break;
                case 2:
                    while (!restart) {
                        System.out.println(score(player.movePl(), player1.movePl()));
                        restart = Logic.setRestart();
                    }
                    break;
            }

        } else {
            switch (Logic.ileGraczy()) {
                case 0:
                    while (!restart) {
                        System.out.println(score(player.aiEng(), player1.aiEng()));
                        restart = Logic.setRestart();
                    }
                    break;
                case 1:
                    while (!restart) {
                        System.out.println(score(player.moveEng(), player1.aiEng()));
                        restart = Logic.setRestart();
                    }
                    break;
                case 2:
                    while (!restart) {
                        System.out.println(score(player.moveEng(), player1.moveEng()));
                        restart = Logic.setRestart();
                    }
                    break;
            }
        }
    }

    private static boolean language() {
        Scanner scanner = new Scanner(System.in);
        boolean x = false;
        String txt = null;
        System.out.println("Wynierz język: P-Polski, E-Angielski");
        System.out.println("Choose language: P-Polish, E-English");
        while (!x) {
            txt = scanner.nextLine();
            if (txt.equals("P") || txt.equals("p")) {
                x = true;
                return true;
            } else if (txt.equals("E") || txt.equals("e")) {
                x = true;
                return false;
            } else {
                System.out.println("Błędny symbol! Prosze wybrać: P/E");
                System.out.println("Invalid character provided! Choose: P/E");
            }

        }
        return false;
    }

    private static String score(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Remis";
        } else if (p1.equals("k") || p1.equals("K")) {
            if (p2.equals("p") || p2.equals("P")) {
                return "Wygrał gracz 2.";
            } else {
                return "Wygrał gracz 1.";
            }
        } else if (p1.equals("p") || p1.equals("P")) {
            if (p2.equals("n") || p2.equals("N")) {
                return "Wygrał gracz 2.";
            } else {
                return "Wygrał gracz 1.";
            }
        } else if (p1.equals("n") || p1.equals("N")) {
            if (p2.equals("k") || p2.equals("K")) {
                return "Wygrał gracz 2.";
            } else {
                return "Wygrał gracz 1.";
            }
        }
        return null;
    }

    private static String scoreEng(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw";
        } else if (p1.equals("R") || p1.equals("r")) {
            if (p2.equals("p") || p2.equals("P")) {
                return "Winer is Player 2.";
            } else {
                return "Winer is Player 1.";
            }
        } else if (p1.equals("p") || p1.equals("P")) {
            if (p2.equals("s") || p2.equals("S")) {
                return "Winer is Player 2.";
            } else {
                return "Winer is Player 1.";
            }
        } else if (p1.equals("s") || p1.equals("S")) {
            if (p2.equals("R") || p2.equals("r")) {
                return "Winer is Player 2.";
            } else {
                return "Winer is Player 1.";
            }
        }
        return null;
    }



    private static boolean setRestartEng() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do You want restart?? Y-Yes, N-No");
        boolean x = false;
        while (!x) {
            String txt = scanner.nextLine();
            if (txt.equals("Y") || txt.equals("y")) {
                x = true;
                return false;
            } else if (txt.equals("N") || txt.equals("n")) {
                x = true;
                return true;
            } else {
                System.out.println("Invalid character provided! Choose: Y/N");
            }
        }
        return false;

    }

    @Override
    public int run(InputStream in, OutputStream out, OutputStream err, String... arguments) {
        return 0;
    }

    @Override
    public Set<SourceVersion> getSourceVersions() {
        return null;
    }
}
