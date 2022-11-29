package Seminar04;

public class Main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero("John", 150, new Staff());
        Team <Archer> red = new Team<>(hero1);
        red.add(new Archer("Jack", 100, new LongBow(), 20));
        red.add(new Archer("Alex", 100, new Bow(), 10));
        
        Hero hero2 = new Hero("Neo", 150, new LongBow());
        Team <Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("Jack2", 100, new Bow(), 20));
        blue.add(new Magician("Alex2", 100, new Staff(), 10, 10));
        System.out.println(red);
        System.out.println(blue);
        System.out.println(red.getTeamHealthPoint());
    }
}
