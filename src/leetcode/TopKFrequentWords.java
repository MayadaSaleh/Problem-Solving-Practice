/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mayada
 */
public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {

        List<String> result = new ArrayList<>();
        Map<String, Integer> wordsKeeper = new HashMap<>();
        int[] myIntArray;
        int valueInserted = 0, count = 0, repeated = 0;

        //Store words and it's occurrence in hashmap
        for (int i = 0; i < words.length; i++) {
            if (wordsKeeper.containsKey(words[i])) {
                wordsKeeper.put(words[i], wordsKeeper.get(words[i]) + 1);
            } else {
                wordsKeeper.put(words[i], 1);
            }
        }
        //Store words' occurrence in array of integers
        myIntArray = new int[wordsKeeper.size()];
        for (Map.Entry<String, Integer> entry : wordsKeeper.entrySet()) {
            myIntArray[valueInserted] = entry.getValue();
            valueInserted++;
        }
        Arrays.sort(myIntArray);
        //Store words in list of strings
        for (String word : wordsKeeper.keySet()) {
            System.out.println("leetcode.TopKFrequentWords.oooooooooooo()");
            if (count < k) {
                System.out.println("===================");
                if (wordsKeeper.get(word).equals(myIntArray[myIntArray.length - count - 1])) {
                    if ((myIntArray[myIntArray.length - count - 1] == myIntArray[myIntArray.length - count - 2])) {
                        repeated++;
                        result.add(word);
                        count++;
                        System.out.println("leetcode.TopKFrequentWords.uuuuuuuuuuuu()");

                    } else if (repeated == 1) {
                        result.add(word);
                        System.out.println("leetcode.TopKFrequentWords.eeeeeeeeeeee()");

                    } else {
                        result.add(word);
                        count++;
                        System.out.println("leetcode.TopKFrequentWords.ddddddddddddd()");

                    }
                }
            }
        }

        System.out.println("leetcode.TopKFrequentWords.topKFrequent()" + result.size());
        // Swaping at same number of occurrence 
        for (int j = 0; j < myIntArray.length; j++) {
            if (j < (result.size() - 1)) {
                if ((myIntArray[myIntArray.length - j - 1] == myIntArray[myIntArray.length - j - 2] && (result.get(j).charAt(0) > result.get(j + 1).charAt(0)))) {
                    String firstString, secondString;
                    firstString = result.get(j);
                    secondString = result.get(j + 1);
                    result.remove(firstString);
                    result.add(j + 1, firstString);
                    result.remove(secondString);
                    result.add(j, secondString);
                }
            }
        }
        return result.subList(0, k);
    }
}
