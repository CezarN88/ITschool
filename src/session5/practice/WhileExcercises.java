package session5.practice;

public class WhileExcercises {

    public static void main(String[] args) {
        printNumbers();
        printSumUntilLimit(100);

    }
    public static void printNumbers() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    public static void printSumUntilLimit(int value) {
        int number = 1;
        int sum = 0;
        while (number < value) {
            sum += number;
            number++;
        }
        System.out.println("Sum: " + sum);
    }
}
