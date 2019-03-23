package pl.sdacademy.beginner.fibonacci;

public class Fibonacii {

    public static void main(String[] args) {
        int output = new Fibonacii().fibonacciWithLoop(10);
        System.out.println(output);
    }


   private int fibonacciRecursive(int position){
        if(position ==0) return 0;
        if(position ==1) return 1;
        else
            return fibonacciRecursive(position-1) + fibonacciRecursive(position - 2);

    }

    private int fibonacciWithLoop(int n){
        if(n ==0) return 0;
        if(n ==1) return 1;

        int prev = 0;
        int current = 1;
        int next=prev + current;
        for (int i = 2; i < n; i++) {
            prev = current;
            current = next;
            next = prev + current;
        }
        return next;

    }
}
