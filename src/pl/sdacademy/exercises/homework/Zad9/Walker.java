package pl.sdacademy.exercises.homework.Zad9;

public class Walker {
    private int x;
    private int y;

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    void moveNorth() {
        this.y -= 1;
    }

    void moveSouth() {
        this.y += 1;
    }

    void moveEast() {
        this.x += 1;
    }

    void moveWest() {
        this.x -= 1;
    }
}
