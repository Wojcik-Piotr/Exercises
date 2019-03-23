package pl.sdacademy.exercises.homework.Zad17;

import java.util.Scanner;

public class ZellersCongruence {
    private Scanner scanner=new Scanner(System.in);
    private int day;
    private int month;
    private int year;

    public ZellersCongruence(){
        setDay();
        setMonth();
        setYear();
        dayOfWeek(calculate());
    }

    private void setDay(){
        System.out.println("Podaj dzień:");
        day= scanner.nextInt();
        if (day<1||day>31){
            System.out.println("Podano błędnydzień!");
            setDay();
        }
    }
    private void setMonth() {
        System.out.println("Podaj miesiąc");
        month = scanner.nextInt();
        if (month<1||month>12){
            System.out.println("Podano łędny miesiąć! Ptosze podać z przedziału [1-12]");
            setMonth();
        }else if (month < 3) {
            month += 12;
            year -= 1;
        }
    }
    private void setYear(){
        System.out.println("Podaj rok");
        year=scanner.nextInt();
    }
    private void dayOfWeek(int dayOfWeek){
        if (dayOfWeek==0){
            System.out.println("it's Saturday");
        }else if (dayOfWeek==1){
            System.out.println("it's Sunday");
        }else if (dayOfWeek==2){
            System.out.println("it's Monday");
        }else if (dayOfWeek==3){
            System.out.println("it's Tuesday");
        }else if (dayOfWeek==4){
            System.out.println("it's Wednesday");
        }else if (dayOfWeek==5){
            System.out.println("it's Thursday");
        }else if (dayOfWeek==6){
            System.out.println("it's Friday");
        }
    }


    private int calculate() {
        int k = year % 100;
        int j = year / 100;
        int dayOfWeek = ((day + (((month + 1) * 26) / 10) +
                k + (k / 4) + (j / 4)) + (5 * j)) % 7;
        return dayOfWeek;
    }
}
