package Seminar04;

public class Main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero("John", 150, new Staff(), new ZeroShield());
        Team <Archer> red = new Team<>(hero1);
        red.add(new Archer("Jack", 100, new LongBow(), new BigShield(), 20));
        red.add(new Archer("Alex", 100, new Bow(), new SmallShield(),10));
        
        Hero hero2 = new Hero("Neo", 150, new LongBow(), new ZeroShield());
        Team <Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("Jack2", 100, new Bow(), new BigShield(), 20));
        blue.add(new Magician("Alex2", 80, new Staff(), new SmallShield(), 10, 10));
        System.out.printf("Red team:\n");
        System.out.print(red);
        System.out.printf("Red team healthpoints: %d",red.getTeamHealthPoint());
        System.out.printf("\n\n");
        System.out.printf("Blue team:\n");
        System.out.print(blue);
        System.out.printf("Blue team healthpoints: %d",blue.getTeamHealthPoint());
        
    }
}
