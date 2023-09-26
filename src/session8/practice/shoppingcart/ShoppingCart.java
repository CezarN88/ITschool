package session8.practice.shoppingcart;

public class ShoppingCart {

    public static void main(String[] args) {
        Product product1 = new Product("Soap",8.99);
        Product product2 = new Product("Sponge",14.28);

        Cart cart1 = new Cart();
        cart1.addProduct(product1);
        cart1.addProduct(product2);

        System.out.println("The total price is: " + cart1.totalPrice());
    }
}