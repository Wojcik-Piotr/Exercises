package pl.sdacademy.beginner.object;

public class Main {

    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Animal animal = new Animal();
        animal.name = "test";
        System.out.println(animal.hashCode());
//        testUser(animal);
    }

    public void testUser(Object o) {
        User user = (User) o;
        System.out.println(user.name);
    }
}
