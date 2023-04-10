import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class test {
    
    public static void main(String[] args) {
            String line = "1;Important information;This is very important info;21-12-2022";
            String[] lines = line.split(";");
            System.out.println(lines[3]);
            String [] dateStr = lines[3].split("-");

            for (String string : lines) {
                System.out.println(string);
            }
            
            System.out.println(dateStr[0]);
            System.out.println(Integer.parseInt(dateStr[1])-1);
            System.out.println(Integer.parseInt(dateStr[2]));

            Calendar date = new GregorianCalendar(Integer.parseInt(dateStr[0]), Integer.parseInt(dateStr[1])-1, Integer.parseInt(dateStr[2]));
            System.out.printf("id: %d, заголовок: %s, описание: %S, дата: %s",Integer.parseInt(lines[0]), lines[1], lines[2], date);
            
            // return new Note(Integer.parseInt(lines[0]), lines[1], lines[2], date);
        }
}
