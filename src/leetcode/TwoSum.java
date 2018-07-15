/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mayada
 * @author mohamed
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

    /**
     * @param nums
     * @param target
     * @return return indices of the two numbers such that they add up to a specific target
     */
    public int[] twoSumOrderOfN(int[] nums, int target) {
      //Brute force solution take O(n2) time.
      //Implement Solutiontake O(n) time and O(n) space.
      HashMap<Integer,Integer> numsIndeceis = new HashMap<Integer,Integer>(nums.length);
      for (int index = 0;index < nums.length ; index++) {
          numsIndeceis.put(nums[index],index);
      }
      
      int [] result = new int [2];
      for (int index = 0;index < nums.length ; index++) {
          if (numsIndeceis.containsKey(target - nums[index]) && numsIndeceis.get(target - nums[index]) != index) {
              result [0] = index;
              result [1] = numsIndeceis.get(target - nums[index]);
              return result;
           }
      }
      
      return null;
  }
    
}
