package pl.sdacademy.beginner.day5.cw1;

public class Animal {
    private int legsCount;
    private String name;

    private Animal(int legsCount){
        this.legsCount=legsCount;
    }
    private Animal(String name){
        this.name=name;
    }
    private Animal(String name, int legsCount){
        this.name=name;
        this.legsCount=legsCount;
    }
    public void getInfo(){
        System.out.println("My name is "+name);
        System.out.println("I have "+legsCount+" legs!");
    }
    public String toString(){
        return "My name is "+name+"\n"+"I have "+legsCount+" legs!";
    }

    public static void main(String[] args) {
        Animal animal=new Animal(2);
        Animal animal1=new Animal("Max");
        Animal animal2=new Animal("Sisey", 4);
        //animal2.getInfo();
        System.out.println(animal2.toString());
    }
}
