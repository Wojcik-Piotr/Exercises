package pl.sdacademy.beginner.enums;

public class User {
    private String name;
    private State state = State.DISABLED;


    public boolean isActive(){
        return state != State.DISABLED;
    }

    public static void main(String[] args) {
        String stateFromUser = "Disabled";
        String stateAsEnum = "DISABLED";

        State enumFromUser= State.getByName(stateFromUser);
        State enumFromByEnum= State.valueOf(stateAsEnum);
    }
}
