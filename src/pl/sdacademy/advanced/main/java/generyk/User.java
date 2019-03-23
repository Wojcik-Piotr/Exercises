package pl.sdacademy.advanced.main.java.generyk;

public class User implements Comparable<User> {
    private String name;
    private String surname;
    private int height;

    public User(String name, String surname, int height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    @Override
    public int compareTo(User o) {
        int bySurname = surname.compareTo(o.surname);
        return bySurname == 0 ? name.compareTo(o.name) : bySurname;
    }
}
