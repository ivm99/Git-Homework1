package Seminar03_HW;

import java.util.Arrays;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
        LinkedUser user1 = new LinkedUser(1, "Иван", "Петров", 2);
        LinkedUser user2 = new LinkedUser(2, "Василий", "Теркин", 3);
        LinkedUser user3 = new LinkedUser(3, "Сергей", "Смирнов");

        
        List <LinkedUser> personal = Arrays.asList(user1, user2, user3);
    

    for(LinkedUser user: personal) {
        System.out.println(user);
    }
}
}

