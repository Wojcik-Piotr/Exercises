package pl.sdacademy.beginner.string;

public class StringMain {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("test");
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        String output = builder.toString();
    }
}
