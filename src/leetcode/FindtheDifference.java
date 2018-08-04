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
public class FindtheDifference {

    public char findTheDifference(String s, String t) {

        char c = t.charAt(t.length() - 1);
        for (int i = 0; i < t.length() - 1; ++i) {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        return c;

//        Map<Character, Integer> map = new HashMap<>();
//        int val = 0;
//        for (int i = 0; i < t.length(); i++) {
//            val = 1;
//            if (map.containsKey(t.charAt(i))) {
//                val = map.get(t.charAt(i));
//                val++;
//            }
//            map.put(t.charAt(i), val);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (map.containsKey(s.charAt(i))) {
//                int x = map.get(s.charAt(i));
//                map.replace(, x);
//                map.remove(s.charAt(i));
//            }
//        }
//        return map.keySet().iterator().next();
    }
}
