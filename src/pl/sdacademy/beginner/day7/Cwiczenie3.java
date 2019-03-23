package pl.sdacademy.beginner.day7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cwiczenie3 {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee("Kowal", "Jan", 34, 3400.0),
                new Employee("As", "Ala", 27, 4100.0),
                new Employee("Kot", "Zofia", 33, 3700.0),
                new Employee("Puchacz", "Jan", 41 , 3600.0)
        );
        List<Employee> nowy= employee
                .stream()
                .filter(employee1 -> employee1.getLata()>30 && employee1.getPensja()<4000)
                .collect(Collectors.toList());
        for (Employee employee1: nowy){
            System.out.println(employee1.getImie()+" "+employee1.getNazwisko());
        }
    }
}
