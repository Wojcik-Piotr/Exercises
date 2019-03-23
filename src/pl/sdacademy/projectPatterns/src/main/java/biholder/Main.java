package pl.sdacademy.projectPatterns.src.main.java.biholder;

public class Main {
    public static void main(String[] args) {
        RandomInt randomInt=new RandomInt();
        ConsolPrinter consolPrinter=new ConsolPrinter();
        SaveToFile saveToFile=new SaveToFile();
        randomInt.subscribe(consolPrinter);
        randomInt.subscribe(saveToFile);
        randomInt.generateNumbers();
    }
}
