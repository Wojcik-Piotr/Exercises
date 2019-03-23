package pl.sdacademy.beginner.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamExample {
    public static void main(String[] args) {
        new StreamExample().start();
    }
    public void start(){
        Double collect = asList(1, 2, 3, 30, 60, 10)
                .stream()
                .filter(l->l>10)
                .collect(Collectors.averagingInt(i->i));

        String output = Stream.of("111","@22dsadsa")
                .map(m -> m.toUpperCase())
                .collect(Collectors.joining(","));


        List<List<String>> some = asList(asList("1", "5"), asList("3", "0", "4"));

        some.stream()
                .flatMap(lista->lista.stream())
                .map(s->Integer.parseInt(s))
                .sorted()
                .forEach(s-> System.out.println(s));


        User u = new User("Ania", "test2@gmail.com");
        User u2 = new User("Piotr", "test3@gmail.com");
        User u3 = new User("John", "4test@gmail.com");
        User u4 = new User("Ania", "5test@gmail.com");
        User u5 = new User("Piotr", "6test@gmail.com");
        User u6 = new User("Piotr", "7test@gmail.com");
        User u7 = new User("Test", "8test@gmail.com");

//        Arrays.asList(u, u2, u3, u4, u5, u6, u7)
//                .stream().collect(groupingBy(u->u, Collectors.counting()));
        System.out.println();

        Map<String, Long> collect1 = Arrays.asList("a", "a", "b").stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println();


    }

}
