package session18;

import java.util.Arrays;

public class Problem1 {

    //Given a sentence, count how many words in the sentence have more than three characters. You can consider a word to be a sequence of characters separated by spaces.

    public static void main(String[] args) {
        String sentence = "Today is Halloween";
       long result  = Arrays.stream(sentence.split(" "))
               .filter(word -> word.length() > 3)
               .count();
        System.out.println(result);
    }
}