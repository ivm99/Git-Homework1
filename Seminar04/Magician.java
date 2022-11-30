package Seminar04;

public class Magician extends Warrior <Staff, SmallShield>{
  
    private int range;
    private int mana;

    public int getRange() {
        return range;
    }
    
    public int getMana() {
        return mana;
    }

    public Magician(String name, int healthPoint, Staff weapon, SmallShield shield, int range, int mana) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        this.mana = mana;  
    }
    
    @Override
    public String toString() {
        return String.format("Magician: %s | range - %d | mana - %d", super.toString(), range, mana);
    }
}
