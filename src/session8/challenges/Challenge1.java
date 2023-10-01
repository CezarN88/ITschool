package session8.challenges;

public class Challenge1 {

    //1. Create a shopping list with Array and print the values

    public static void main(String[] args) {
        String[] shoppingList = new String[3];

        shoppingList[0] = "Apple";
        shoppingList[1] = "Bread";
        shoppingList[2] = "Milk";

        System.out.println("Shopping List: ");
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println((i + 1) + ". " + shoppingList[i]);
        }
    }
}