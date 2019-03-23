package pl.sdacademy.projectPatterns.src.main.java.Chain;

public class GeneralHandler implements Handler {
    Handler handler;
    int quantity = 0;
    int valiu;

    GeneralHandler(Handler handler, int valiu) {
        this.handler = handler;
        this.valiu = valiu;
    }

    @Override
    public int handle(int money) {
        if (money / valiu >= 1) {
            quantity = money / valiu;
        }
        System.out.println(valiu + ". wydam " + quantity);
        return money % valiu;
    }

    @Override
    public Handler nexHandler() {
        return handler;
    }
}
