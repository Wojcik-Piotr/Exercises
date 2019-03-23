package pl.sdacademy.scribbles.tutorial.basic;

public class ReferenceAndValue {
        public static void main(String[] angs) {
            int x=5;
            addOneTo(x);

            System.out.println(x);

            Person john;
           // john=new Person();
          //  john.setAge(20);
         //  celebrateBrithday(john);
    }
    static void addOneTo(int number) {
            number=number+1;
    }
    static void celebrateBrithday(Person person){
            person.setAge(person.getAge()+1);
    }
}
