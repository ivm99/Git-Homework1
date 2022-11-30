package Seminar04;

public class ZeroShield implements Shield{
    
    @Override
    public int protect() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("No Shield");
    }
}
