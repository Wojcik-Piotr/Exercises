package pl.sdacademy.projectPatterns.src.main.java.builder;

public  class WildAnimalBuilder {
    private String spaceName;
    private int legsCount;
    private boolean predator;
    private double weight;
    private String diet;

    WildAnimalBuilder(String spaceName){
        this.spaceName=spaceName;
    }

    public WildAnimalBuilder setLegsCount(int legsCount){
        this.legsCount=legsCount;
        return this;
    }

    public WildAnimalBuilder setPredator(boolean predator){
        this.predator=predator;
        return this;
    }

    public WildAnimalBuilder setWeight(double weight){
        this.weight=weight;
        return this;
    }
    public WildAnimalBuilder setDiet(String diet){
        this.diet=diet;
        return this;
    }
    public WildAnimal createWildAnimal(){
        return new WildAnimal(spaceName,legsCount,predator,weight,diet);
    }
}
