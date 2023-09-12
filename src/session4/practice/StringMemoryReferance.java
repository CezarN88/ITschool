package session4.practice;

public class StringMemoryReferance {
    public static void main(String[] args) {
        String greetingOne = "Heloo";
        String greetingTwo  = "Hello";
        String greeting =  new String("Hello");


        System.out.println(greetingTwo == greeting);
        System.out.println(greetingTwo.equals(greeting));
        System.out.println(greeting == greetingOne);

        int number1 = 10;
        double number2 = 123.2;
        System.out.println(number1 == number2);
    }
}
