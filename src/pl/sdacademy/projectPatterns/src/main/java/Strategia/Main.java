package pl.sdacademy.projectPatterns.src.main.java.Strategia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Scanner scanner = new Scanner(System.in);

        hero.fight();

        System.out.println("1 - Sword, 2 - Bow");
        int eqip = scanner.nextInt();
        switch (eqip) {
            case 1:
                hero.setFightStyle(new SwordFightStyle());
                break;
            case 2:
                hero.setFightStyle(new BowFightStyle());
                break;

        }
        hero.fight();
    }
}
