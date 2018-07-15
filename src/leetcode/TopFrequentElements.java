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

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();
        int frequency = 0;
        PriorityQueue<ArrayElements> pQueue = new PriorityQueue<>();

        // Insert Elements by there larget occurance number 
        for (int i = 0; i < nums.length; i++) {
            if (myMap.get(nums[i]) == null) {
                myMap.put(nums[i], 1);

            } else {
                frequency = myMap.get(nums[i]);
                myMap.remove(nums[i]);
                myMap.put(nums[i], frequency + 1);
            }

        }

        // Adding elements to priority queue accourding to max occurance
        Iterator iterator = myMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            pQueue.add(new ArrayElements((Integer)pair.getKey(),(Integer)pair.getValue()));
        }

        for (int i = 0; i < k; i++) {
            list.add(pQueue.poll().getElement());
        }
        return list;
    }

}
