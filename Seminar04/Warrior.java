package Seminar04;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weapon weapon;
    
    public Warrior(String name, int healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
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

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Health: %d Weapon: %s ", name, healthPoint, weapon);
    }
    
}
