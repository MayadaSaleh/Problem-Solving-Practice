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
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int counter = 0;
        int recentI = -1;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            i = recentI+1;

            while (i < t.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    counter++;
                    recentI = i;
                    break;
                } else {
                    i++;
                }
            }
            if (counter == 0) {
                return false;
            }
        }

        if (counter == s.length()) {
            return true;
        }
        return false;
    }
}
