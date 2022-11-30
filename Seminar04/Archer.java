package Seminar04;

public class Archer extends Warrior <Bow, Shield>{

    private int range;

    public int getRange() {
        return range;
    }


    public Archer(String name, int healthPoint, Bow weapon, Shield shield, int range) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        
    }
    @Override
    public String toString() {
        return String.format("Archer: %s | range - %d", super.toString(), range);
    }
}
