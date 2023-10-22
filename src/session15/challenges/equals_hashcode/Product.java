package session15.challenges.equals_hashcode;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product product1 = new Product("apple", 5.99, 1);
        Product product2 = new Product("orange", 9.99, 1);

        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("Hashcode of product1: " + product1.hashCode());
        System.out.println("Hashcode of product2: " + product2.hashCode());

        product1.id = 2;

        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("Hashcode of product1:" + product1.hashCode());
        System.out.println("Hashcode of product2:" + product2.hashCode());
    }
}