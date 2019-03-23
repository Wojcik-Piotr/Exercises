package pl.sdacademy.scribbles.tutorial.basic;

public class Arrays {
    public static void main(String[] args) {
        int x;
        int[] myArray;
        //myArray= new int[50000];
        myArray=new int[]{1,2,3,4,5,6,7,8,9,10};

        /*x=5

        myArray[0]=x;
        myArray[1]=3;
        myArray[2]=0;
        myArray[3]=1;

        System.out.println(myArray[0]);
        for (int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
        for (int counter=0; counter<myArray.length;counter++){
            myArray[counter]=counter;
        }*/

        for (int number: myArray){
            System.out.println(number);
        }
    }
}
