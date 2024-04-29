package week9.tornike_kadeishvili_1.task4;

import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        //create the set of all words
        Set<String> words = new HashSet<>(fantasyFormatData);

        //create a map of word lengths and their occurrences, by iterating through all the words of the set through all words
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }


        //System.out.println(words);

        System.out.println(wordLengthMap);



    }
}
