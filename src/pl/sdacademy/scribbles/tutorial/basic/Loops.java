package pl.sdacademy.scribbles.tutorial.basic;

public class Loops {
    public static void main(String[] angs){
        //whileloop();
        dowhileloop();

    }
    static void whileloop() {
        int counter=0;
        while (counter<10) {
            counter=counter+1;
            System.out.println(counter);
        }
    }
    static void dowhileloop() {
        int counter=0;
        do {
            counter=counter+1;
            System.out.println(counter);
        }
        while (counter<10);
    }
    static void forloop() {
        for(int counter=0; counter<10; counter=counter+1) {
            System.out.println(counter);
        }
    }
}
