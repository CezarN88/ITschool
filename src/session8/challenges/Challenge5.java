package session8.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5 {

    //5. Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Iasi");
        cities.add("Cluj");
        cities.add("Timisoara");
        cities.add("Arad");
        cities.add("Satu Mare");

        System.out.println("The cities list is: " + cities);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a  new city name: ");
        String cityName = scanner.nextLine();

        if (cities.contains(cityName)) {
            System.out.println("This city name is already in the list.");
        } else {
            cities.add(cityName);
            System.out.println("City name added to the list: " + cityName);
        }
        scanner.close();
        System.out.println("New cities list is: ");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}