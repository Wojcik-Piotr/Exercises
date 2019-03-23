package pl.sdacademy.projectPatterns.src.main.java.biholder;

public class ConsolPrinter implements Observer {

    @Override
    public void handleSubjectMessenge(int ranfomIntiger) {
        System.out.println(ranfomIntiger);
    }
}
