package Seminar04;

public class Archer extends Warrior{

    private int range;

    public int getRange() {
        return range;
    }
    public Archer(String name, int healthPoint, Bow weapon, int range) {
        super(name, healthPoint, weapon);
        this.range = range;
    }
    @Override
    public String toString() {
        return String.format("Archer: %s, range - %d", super.toString(), range);
    }
}
