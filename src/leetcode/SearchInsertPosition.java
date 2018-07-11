/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author Mayada
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int arrayLength = nums.length;
        int low = 0;
        int high = arrayLength - 1;
        int[] newArray = null;
        int middle;
        
        
        
        if (nums[high] < target) {
            return high + 1;
        } else if (nums[0] > target) {
            return 0;
        } else {

            middle = getMiddle(low, high);

            while (high > low && nums[middle] != target) {
                
                if (nums[middle] < target) {
                    low = middle + 1;
                    if (nums[low] == target || (nums[low] > target && target > nums[low - 1])) {
                        return low;
                    } else {
                        middle = getMiddle(low, high);
                    }
                    
                } else if (nums[middle] > target) {
                    high = middle - 1;
                    if (nums[high] == target) {
                        return high;
                    } else if (nums[high] < target) {
                        return high + 1;
                    } else {
                        middle = getMiddle(low, high);
                    }
                }
            }
        }

        return middle;
    }

    int getMiddle(int low, int high) {
        return low + ((high - low) / 2);
    }

}
