/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mayada
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int newsum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            newsum = Math.max(newsum + nums[i], nums[i]);
            max = Math.max(max, newsum);
        }
        return max;
    }
}
