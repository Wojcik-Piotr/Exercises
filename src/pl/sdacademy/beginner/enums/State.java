package pl.sdacademy.beginner.enums;

public enum State {
    DISABLED("Disabled"), ENABLED("Enabled"), TRIAL("Trial"),
    WAITING_FOR_DATA("Waiting for data"), EXPIRED_TRIAL("Expired trial");

    State(String name) {
        this.name = name;
    }

    private String name;

    public String getName(){
        return name;
    }

    public static State getByName(String name){
        for (State state : State.values()) {
            if(state.name.equals(name))
                return state;
        }
        throw new IllegalArgumentException();
    }
}
