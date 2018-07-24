/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Mayada
 */
public class TopFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> myMap = new HashMap<>();
        int frequency = 0;
        PriorityQueue<ArrayElement> pQueue = new PriorityQueue<>();

        // Insert Elements by there larget occurance number 
        for (int i = 0; i < nums.length; i++) {
            if (!myMap.containsKey(nums[i])) {
                myMap.put(nums[i], 1);

            } else {
                frequency = myMap.get(nums[i]);
                myMap.put(nums[i], frequency + 1);
            }
        }
        // Adding elements to priority queue accourding to max occurrence 
        Iterator iterator = myMap.entrySet().iterator();
        int mappedElement, mappedFrequency;
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
             mappedElement = (Integer) pair.getKey();
             mappedFrequency = (Integer) pair.getValue();
            pQueue.add(new ArrayElement(mappedElement,mappedFrequency));
        }
        List<Integer> list = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            list.add(pQueue.poll().getElement());
        }
        return list;
    }
        // function to get summation of odd numbers from 1 to 15 
     public int getSummation (){
        int sum =0;
        for(int i=1; i<=15;i++){
            if(i%2 !=0){
                sum = sum+i ;
            }
        }
        return sum;
    }
}
