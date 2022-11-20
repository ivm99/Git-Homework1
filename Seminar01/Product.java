package Seminar01;
public class Product {
    private String name;
    private double price;

public Product(String name) {
    this.name = name;
}


public Product(String name, double price) {
    this(name);
    this.price = price;

}


@Override
public String toString() {
    
    return String.format("название: %s \tцена: %,.2f", getName(), getPrice());
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}


}
