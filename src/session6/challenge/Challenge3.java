package session6.challenge;

public class Challenge3 {

    //3. Concatenate Multiple Strings
    //Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

    public static void main(String[] args) {
        String[] stringArray = {"This", "is", "a", "concatenated", "string"};
        System.out.println(concatenateStrings(stringArray));
    }

    public static String concatenateStrings(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < stringArray.length; index++) {
            stringBuilder.append(stringArray[index] + " ");
        }
        return stringBuilder.toString();
    }
}
