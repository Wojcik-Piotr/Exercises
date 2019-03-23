package pl.sdacademy.projectPatterns.src.main.java.builder;

public class PersonBuilderMain {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder("Adam", "Kowalski")
                .setNewCity("Wrocław")
                .setNewIsFemale(false)
                .setNewStreetAddress("ul. Powstańców");
        Person adam = personBuilder.createPerson();
    }
}
