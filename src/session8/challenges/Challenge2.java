package session8.challenges;

import java.util.ArrayList;

public class Challenge2 {

    //2. Create a wishlist for christmas with ArrayList and print the values

    public static void main(String[] args) {
        ArrayList<String> christmasWishlist = new ArrayList<>();

        christmasWishlist.add("Smartphone");
        christmasWishlist.add("Laptop");
        christmasWishlist.add("Watch");

        System.out.println("Christmas WishList: ");
        for (int i = 0; i < christmasWishlist.size(); i++) {
            System.out.println((i + 1) + ". " + christmasWishlist.get(i));
        }
    }
}