package session4.challenge;

public class challenge7 {

    //7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".

    public static void main(String[] args) {
        int sideOne = 3;
        int sideTwo = 3;
        int sideThree = 3;
        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" : "Scalene";

        System.out.println(triangleType);

    }
}

