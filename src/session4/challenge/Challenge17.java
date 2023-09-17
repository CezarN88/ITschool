package session4.challenge;

public class Challenge17 {

    //17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:
    //If both hasUsername and hasPassword are true, print "Authentication successful".
    //If either hasUsername or hasPassword is false, print "Authentication failed".
    //If hasUsername is true but hasPassword is false, print "Password is incorrect".

    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;

        if (hasUsername && hasPassword) {
            System.out.println("Authentification successful");
        } else if (!hasUsername || !hasPassword) {
            System.out.println("Authentification failed");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}