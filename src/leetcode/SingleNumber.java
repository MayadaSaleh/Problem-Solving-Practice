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
public class SingleNumber {

    public int singleNumber(int[] nums) {

        Set<Integer> mySet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (mySet.contains(nums[i])) {
                mySet.remove(nums[i]);
            } else {
                mySet.add(nums[i]);
            }
        }
        return mySet.iterator().next();

    }
}
