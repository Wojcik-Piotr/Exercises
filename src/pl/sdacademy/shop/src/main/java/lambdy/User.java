package pl.sdacademy.shop.src.main.java.lambdy;

public class User {
    private final String name;
    private final String surname;
    private String Pesel;

    public User(String pesel) {
        this.Pesel = pesel;
        surname = null;
        name = null;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User setName(String name) {
        return new User(name, getSurname());
    }

    public User setSurname(String surname) {
        return new User(getName(), surname);
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return Pesel;
    }


}
