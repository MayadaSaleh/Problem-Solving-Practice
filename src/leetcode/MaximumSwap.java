/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mayada
 */
public class MaximumSwap {

    public int maximumSwap(int num) {

        String numString = String.valueOf(num);
        int[] myArray = new int[numString.length()];
        int[] sortedArray = new int[numString.length()];
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numString.length(); i++) {
            myArray[i] = numString.charAt(i) - '0';
            sortedArray[i] = numString.charAt(i) - '0';
            myMap.put(numString.charAt(i) - '0', i);
        }

        Arrays.sort(sortedArray);
        hh:
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != sortedArray[(myArray.length) - i - 1]) {
                int x1 = myArray[i];
                int x2 = sortedArray[(myArray.length) - i - 1];
                myArray[i] = x2;
                int place = myMap.get(x2);
                myArray[place] = x1;
                break hh;
            }
        }
        int result = 0;
        for (int temp = 0; temp < myArray.length; temp++) {
            result *= 10;
            result += myArray[temp];
        }
        return result;
    }
}
