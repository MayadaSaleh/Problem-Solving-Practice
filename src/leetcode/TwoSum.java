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
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Set<Integer> mySet = new HashSet<>();


        for (int j = 0; j < nums.length; j++) {
            int firstNumber = nums[j];
            int secondNumber = target - firstNumber;

            if (mySet.contains(secondNumber)) {
                result[0] = j;
                result[1] = getSecondNumberIndex(secondNumber, nums);
                if(result[0]!=result[1]){
                    //swaping
                 result[0]=result[0]+result[1];
                 result[1]=result[0]-result[1];
                 result[0]=result[0]-result[1];
                return result;
                }
            }
            mySet.add(firstNumber);
        }

        return result;
    }

    private int getSecondNumberIndex(int secondNumber, int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == secondNumber) {
                return i;
            }
        }
        return -1;
    }

}
