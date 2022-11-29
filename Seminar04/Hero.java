package Seminar04;

public class Hero extends Warrior {


    public Hero(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Hero: %s", super.toString());
    }
    
}
