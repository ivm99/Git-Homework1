package Seminar01;

public class Milk extends Product{
    private double fat;

    public Milk (String name) {
        super(name);
    }
    
    public Milk (String name, double price) {
        super (name, price);
    }

    public Milk (String name, double price, double fat) {
        super(name, price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("%s \tжирность: %,.1f", super.toString(), getFat());
    }
}
