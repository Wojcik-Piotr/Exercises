package pl.sdacademy.projectPatterns.src.main.java.Strategia;

public class Hero {
    private FightStyle fightStyle;

    public Hero(){
        this.fightStyle=new UnarmFightStyle();
    }

    public void setFightStyle(FightStyle fightStyle) {
        this.fightStyle = fightStyle;
    }

    void fight(){
        fightStyle.fight();
    }
}
