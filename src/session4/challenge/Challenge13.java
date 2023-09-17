package session4.challenge;

public class Challenge13 {

    //13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values.

    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        System.out.println(isRaining);
        System.out.println(isRaining);

        boolean notRaining = !isRaining;
        boolean notSunny = !isSunny;

        System.out.println("Negated isRaining: " + notRaining);
        System.out.println("Negated isSunny: " + notSunny);
    }
}