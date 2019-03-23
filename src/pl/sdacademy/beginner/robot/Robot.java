package pl.sdacademy.beginner.robot;

public class Robot {
    public static final int SLOT_AMOUNT = 10;
    public static final int SLOT_CAPACITY = 15;
    private boolean hasBlock = false;
    private int[] slot = new int[SLOT_AMOUNT];
    private int position = 0;

    public String robot(String commands) {
        char[] splitted = commands.toCharArray();

        for (char c : splitted) {
//            if (c == 'L') lower();
//            if (c == 'M') move();
//            if (c == 'P') pick();
        }
        StringBuilder b  = new StringBuilder();

        for (int i : slot) {
            b.append(i).append(",");
        }
       return b.toString();
    }

    private void move() {
        if (position <= SLOT_AMOUNT) position++;
    }
}
