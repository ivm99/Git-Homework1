package Seminar01;

import java.util.ArrayList;

public class VendingMachine {
    private int machineNumber;
    private ArrayList <Product> products;

    public VendingMachine(int machineNumber, ArrayList prod) {
        this.machineNumber = machineNumber;
        this.products = prod;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Номер машины: " + machineNumber + "\n");
        for (Product product : products) {
            result.append(product.toString() + "\n");
        }
        result.append("\n\n");
        return result.toString();
    }

    public ArrayList <Product> getProductBy(String item) {
        ArrayList <Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(item)) {
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }

    public ArrayList <Product> getProductBy(double item) {
        ArrayList <Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() == item) {
                selectedProducts.add(product);
            }
        } 
        return selectedProducts;
}
}
