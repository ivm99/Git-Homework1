package Seminar04;

public class BigShield implements Shield {

    @Override
    public int protect() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("BigShield - protection %d", protect());
    }
    
    
}
