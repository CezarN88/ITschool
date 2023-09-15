package session5.practice;

public class IfExercises {

    public static void main(String[] args) {
        int number = 5;
        printMultipleNumberComparisonInfo(number);
    }

    private static void printNumberComparationInfo(int number, int numberToCompare) {
        if (number > numberToCompare) {
            System.out.println("The number is grater than 10.");
        } else if (number == numberToCompare) {
            System.out.println("The number is equal with 10.");
        } else {
            System.out.println("The number is smaller than 10.");
        }
    }

    private static void printMultipleNumberComparisonInfo(int number) {
        if (number >= 0 && number <= 50) {
            System.out.println("The number is between 0 & 50");
        } else if (number >= 51 && number <= 100) {
            System.out.println("The number is between 51 and 100");
        } else {
            System.out.println("The number is out of range");
        }
    }
}

