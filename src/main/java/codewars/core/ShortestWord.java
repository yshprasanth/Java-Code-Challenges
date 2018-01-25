package codewars.core;

import java.util.stream.Stream;

/**
 * Shortest Word


 x Simple, given a string of words, return the length of the shortest word(s).

 String will never be empty and you do not need to account for different data types.

 */
public class ShortestWord {
    private String sentence;

    public int getShortestWordLength() {
        String[] tokens = sentence.split("\\s+");
        int minLength = 0;

        long time1 = System.nanoTime();
        minLength = tokens[0].length();
        for(int i=1; i<tokens.length; i++){
            if(tokens[i].length()<minLength)
                minLength = tokens[i].length();
        }
        long time2 = System.nanoTime();
        System.out.println("minLength using for loop(in " + (time2-time1) + "ms): " + minLength);

        time1 = System.nanoTime();
        minLength = Stream.of(sentence.split("\\s+")).mapToInt(x -> x.length()).min().getAsInt();
        time2 = System.nanoTime();
        System.out.println("minLength using Streams(in " + (time2-time1) + "ms): " + minLength);

        return minLength;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }


}
