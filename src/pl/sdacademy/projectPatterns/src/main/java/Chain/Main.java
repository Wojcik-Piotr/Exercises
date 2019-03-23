package pl.sdacademy.projectPatterns.src.main.java.Chain;

public class Main {
    private static Handler handler1 = new GeneralHandler(null, 1);
    private static Handler handler2 = new GeneralHandler(handler1, 2);
    private static Handler handler5 = new GeneralHandler(handler2, 5);
    private static Handler handler10 = new GeneralHandler(handler5, 10);
    private static Handler handler20 = new GeneralHandler(handler10, 20);
    private static Handler handler50 = new GeneralHandler(handler20, 50);
    private static Handler handler100 = new GeneralHandler(handler50, 100);

    private static int money = 891;

    public static void main(String[] args) {
        Handler actualHandler = handler100;
        int actualMoney = money;

        while (actualHandler != null) {
            actualMoney = actualHandler.handle(actualMoney);
            actualHandler = actualHandler.nexHandler();
        }
    }

}
