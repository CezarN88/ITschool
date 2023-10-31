package session18;

import java.util.Arrays;
import java.util.Collections;

public class Problem5 {

    //Given a sentence, reverse the order of the words in the sentence, but not the order of the letters in each word. For instance, "Java is fun" should become "fun is Java".

    public static void main(String[] args) {
        String sentence = "Java is very fun";

        String[] sentenceArray = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int index = sentenceArray.length - 1; index >= 0; index--) {
            builder.append(sentenceArray[index] + " ");
        }

        System.out.println(builder);

        Collections.reverse(Arrays.asList(sentenceArray));
        System.out.println(Arrays.asList(sentenceArray));
    }
}
