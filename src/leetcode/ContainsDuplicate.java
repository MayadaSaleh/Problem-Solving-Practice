/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mayada
 */
public class ContainsDuplicate {

    public boolean checkDuplicateUsingSorting(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1 ; i++) {
           if(nums[i]==nums[i+1]){
               return true;
           } 
        }
        return false;
    }
    
    
     public boolean checkDuplicateUsingSet(int[] nums) {

        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (mySet.contains(nums[i])) {
                return true;
            } else {
                mySet.add(nums[i]);
            }

        }
            return false;

}
}