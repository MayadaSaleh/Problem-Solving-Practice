/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mayada
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        Set<Integer> myMap = new HashSet<Integer>();
        for (int i = 0; i <= nums.length; i++) {
            myMap.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (myMap.contains(nums[i])) {
                myMap.remove(nums[i]);
            }
        }
        return myMap.iterator().next();
    }

}
