/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Mayada
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int firstNumber = nums[i];
            int secondNumber = target - firstNumber;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == secondNumber) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
