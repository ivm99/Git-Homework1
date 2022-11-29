import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
       User bigBoss = new User ("Большой", "Начальник", 50);
       User littleBoss = new User ("Маленький", "Начальник", 30);
        List<User> users = Arrays.asList(new User[]{new User("Иван", "Петров", 40), 
        new User("Василий", "Теркин", 18), 
        new User("Михаил", "Смирнов", 22)});
        Personal personal = new Personal(users);

        for (User user : personal) {
            System.out.println(user);
        }
        System.out.println();
        Collections.sort(users);
        for (User user : personal) {
            System.out.println(user);
        }
        System.out.println();
        
        littleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(littleBoss));
         Company company = new Company(bigBoss);
        for (User user : company) {
            System.out.println(user);
        }
    }
}
