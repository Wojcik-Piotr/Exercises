package pl.sdacademy.exercises.homework.Zad4;

public class SumN {
    private String n;

    public SumN(int n) {
        this.n = String.valueOf(n);
    }

    public int calculate() {
        int result = 0;
        result = Integer.parseInt(n);
        result += Integer.parseInt(n + n);
        result += Integer.parseInt(n + n + n);
        return result;
    }
}
