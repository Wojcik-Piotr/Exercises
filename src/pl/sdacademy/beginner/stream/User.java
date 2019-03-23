package pl.sdacademy.beginner.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        try (InputStream s = new FileInputStream("")) {
            s.read();
            return "z try";
        } catch (Exception e) {
            return "z catch";
        }
    }


    public String getName() {
        return name;
    }


}
