/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mayada
 */
public class FirstUniqueCharacterinaString {

    public int firstUniqChar(String s) {

        Map <Character,Integer> map = new HashMap<>();
        int val = 1;
        for (int i = 0; i < s.length(); i++) {
            val =1;
            if (map.containsKey(s.charAt(i))) {
                val = map.get(s.charAt(i));
                val++;
            }
            map.put(s.charAt(i), val);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
