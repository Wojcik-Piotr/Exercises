package pl.sdacademy.advanced.main.java.generyk;

public class UserGeneric<E,T,K> {
    E pesel;
    K name;
    K surname;
    T password;

    public UserGeneric(E pesel, T password) {
        this.pesel = pesel;
        this.password = password;
    }

    public E getPesel() {
        return pesel;
    }

    public K getName() {
        return name;
    }

    public K getSurname() {
        return surname;
    }

    public T getPassword() {
        return password;
    }
}
