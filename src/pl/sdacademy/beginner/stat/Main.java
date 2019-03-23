package pl.sdacademy.beginner.stat;

public class Main {
    public static void main(String[] args) {


        User user1 = new User();

        user1.name = "user 1";
        user1.age = 1;

        User user2 = new User();
        user2.name = "user 2";
        user2.age = 2;

        User user3 = new User();
        user3.name = "user 3";
        user3.age = 3;

        System.out.println(user1.name + " age " + user1.age);
        System.out.println(user2.name + " age " + user2.age);
        System.out.println(user3.name + " age " + user3.age);
        System.out.println(user1.DEFAULT_NAME);
    }
}
