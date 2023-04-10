// Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину. Переопределить toString, для вывода нового поля

package Seminar01;

import java.util.ArrayList;


/**
 * Exercise01
 */
public class Exercise01 {
    public static void main(String[] args) {
        ArrayList <Product> prods = new ArrayList<>();
        prods.add(new Product("Чипсы", 50.00));
        prods.add(new Product("Лимонад", 80.00));
        prods.add(new Product("Крекеры", 30.00));
        prods.add(new Milk("Городецкое молоко", 65, 3.2));
        prods.add(new Milk("Молоко Простоквашино", 75, 3.0));
        prods.add(new Chocolate("Бабаевский шоколад", 80, 75));
        prods.add(new Chocolate("Шоколад молочный", 85, 55));
        VendingMachine v1 = new VendingMachine(1, prods);
        System.out.print(v1);
        
        String valueForSearch = "Шок";
        if (v1.getProductBy(valueForSearch).size() != 0) {
            for (Product product : v1.getProductBy(valueForSearch)) {
            System.out.print(product+"\n");
            }
        } else {
            System.out.println("Товар не найден");
        }
        
    }
}