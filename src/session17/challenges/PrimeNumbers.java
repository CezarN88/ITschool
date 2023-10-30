package session17.challenges;


import java.util.stream.IntStream;

public class PrimeNumbers {

    //3.Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .filter(PrimeNumbers::isPrime)
                .forEach(System.out::println);

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int index = 5; index * index <= number; index += 6) {
            if (number % index == 0 || number % (index + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}