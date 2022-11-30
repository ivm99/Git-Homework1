package Seminar04;

public class SmallShield implements Shield {

    @Override
    public int protect() {
        return 3;
    }
    @Override
    public String toString() {
        return String.format("SmallShield - protection %d", protect());
    }
    
}
