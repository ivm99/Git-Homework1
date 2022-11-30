package Seminar04;

public abstract class Warrior <T extends Weapon, E extends Shield> {
    private String name;
    private int healthPoint;
    private T weapon;
    private E shield;
    
    public Warrior(String name, int healthPoint, T weapon, E shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealthPoint() {
        return healthPoint;
    }
    
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
    
    public E getShield() {
        return shield;
    }

    public void setShield(E shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("Name - %s | Health - %d | Weapon - %s | Shield - %s", name, healthPoint, weapon, shield);
    }
    
}
