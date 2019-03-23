package pl.sdacademy.exercises.homework.Zad19;

public class Lockers {
    private boolean[] lockerRoom= new boolean[100];

    public Lockers(){
        setLockerRoom();
        evenToggle();
        tripleToggle();
        quadrupleToggle();
        fivefoldToggle();
        count();
    }

    private void setLockerRoom(){
        for (boolean locker :lockerRoom) {
            locker=true;
        }
    }
    private void evenToggle(){
        for (int i = 1; i <=lockerRoom.length ; i++) {
            if (i%2==0){
                toggle(i-1);
            }
        }
    }
    private void tripleToggle(){
        for (int i = 1; i <=lockerRoom.length ; i++) {
            if (i%3==0){
                toggle(i-1);
            }
        }
    }
    private void quadrupleToggle(){
        for (int i = 1; i <=lockerRoom.length ; i++) {
            if (i%4==0){
                toggle(i-1);
            }
        }
    }
    private void fivefoldToggle(){
        for (int i = 1; i <=lockerRoom.length ; i++) {
            if (i%5==0){
                toggle(i-1);
            }
        }
    }

    private void toggle(int locker){
        if (lockerRoom[locker]){
            lockerRoom[locker]=false;
        }else {
            lockerRoom[locker]=true;
        }
    }

    private void count(){
        int counter=0;
        for (boolean locker:lockerRoom) {
            if (locker){
                counter++;
            }
        }
        System.out.println("Zostało "+counter+" otwartych szafek.");
    }
}
