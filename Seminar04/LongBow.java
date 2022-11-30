package Seminar04;

public class LongBow extends Bow {

    @Override
    public Integer damage() {
        return 40;
    }
    
    @Override
    public String toString() {
        return String.format("LongBow - damage %d", damage());
    }

}
