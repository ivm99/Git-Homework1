package Seminar03_HW;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedPersonal implements Iterable<LinkedUser>{
    List <LinkedUser> linkedPersonal = new ArrayList<>();
    
    public LinkedPersonal(List<LinkedUser> linkedPersonal) {
        this.linkedPersonal = linkedPersonal;
    }

    @Override
    public Iterator<LinkedUser> iterator() {
        return new Iterator<LinkedUser>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < linkedPersonal.size();
            }

            @Override
            public LinkedUser next() {
                return linkedPersonal.get(index++);
            }
            
        };
    }
    

}
