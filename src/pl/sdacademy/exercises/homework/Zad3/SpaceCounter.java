package pl.sdacademy.exercises.homework.Zad3;

public class SpaceCounter {

    private String sequence;

    public SpaceCounter(String sequence) {
        this.sequence = sequence;
    }

    public int count() {
        int counter = 0;
        for (char c : sequence.toCharArray()) {
            if (c == ' ') {
                counter++;
            }
        }
        return counter;
    }
}
