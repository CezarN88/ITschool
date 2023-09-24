package session6.challenge;

public class Challenge6 {

    //6. String Replacement
    //Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring. For instance, replace "cat" with "dog" in the string "The cat sat on the mat."

    public static void main(String[] args) {
        String string1 = "The cat sat on the mat.";
        String string2 = "cat";
        String string3 = "dog";

        String finalString = replaceSubstrings(string1, string2, string3);

        System.out.println("First string: " + string1);

        System.out.println("Final string: " + finalString);
    }

    public static String replaceSubstrings(String string1, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string1);
        int index = 0;

        while ((index = stringBuilder.indexOf(string2, index)) != -1) {
            stringBuilder.replace(index, index + string2.length(), string3);
            index += string3.length();
        }
        return stringBuilder.toString();
    }
}
