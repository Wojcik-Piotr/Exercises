package pl.sdacademy.projectPatterns.src.main.java.builder;

public class WildAnimalBiulderMain {
    public static void main(String[] args) {
        WildAnimalBuilder zajac = new WildAnimalBuilder("Zając")
                .setLegsCount(4)
                .setPredator(false)
                .setWeight(2);
        zajac.createWildAnimal();

        WildAnimal.WildAnimalBuilder kon= new WildAnimal.WildAnimalBuilder("Koń")
                .setDiet("Pasza")
                .setLegsCount(4)
                .setPredator(false)
                .setWeight(232.54);
        kon.createWildAnimal();

    }
}
