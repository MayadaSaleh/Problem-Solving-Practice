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
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length > 1) {
            
            int minStringLength = Integer.MAX_VALUE;
            int longestSubstringCounter = 0;
            String longestCommonPrefix;

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < minStringLength) {
                    minStringLength = strs[i].length();
                }
            }

            for (int i = 0; i < minStringLength; i++) {
                longestSubstringCounter = 0;
                longestCommonPrefix = strs[0].substring(0, minStringLength - i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].substring(0, minStringLength - i).equals(longestCommonPrefix)) {
                        longestSubstringCounter++;
                    }
                }
                if (longestSubstringCounter == strs.length - 1) {
                    return longestCommonPrefix;
                }
            }

            return "";

        } else if (strs.length == 1) {
            return strs[0];
        } else {
            return "";
        }

    }
}
