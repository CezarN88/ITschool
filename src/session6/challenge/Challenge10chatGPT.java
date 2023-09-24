package session6.challenge;

import java.util.HashMap;
import java.util.Scanner;

public class Challenge10chatGPT {

    //10. Morse Code Converter
    //Description: Create a program that takes in a string and converts it to Morse code using the StringBuilder class. For simplicity, you can assume the input string only contains alphabets and numbers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (only alphabets and numbers): ");
        String input = scanner.nextLine().toUpperCase(); // Convert to uppercase for simplicity

        String morseCode = convertToMorseCode(input);

        System.out.println("Morse Code: " + morseCode);

        scanner.close();
    }

    public static String convertToMorseCode(String input) {
        // Define a mapping of characters to Morse code
        HashMap<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");

        StringBuilder stringBuilder = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            if (morseCodeMap.containsKey(c)) {
                // Append the Morse code representation with a space separator
                stringBuilder.append(morseCodeMap.get(c)).append(" ");
            } else {
                // Handle characters that are not in the mapping (e.g., spaces)
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString().trim(); // Trim any trailing space
    }
}