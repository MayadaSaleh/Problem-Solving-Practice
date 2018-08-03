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
public class LengthofLastWord {

   public int lengthOfLastWord(String s) {
          int lastLength = 0;
        if (s.length()==0) {
            return 0;
        } else if (s.charAt(0) != ' ') {
            lastLength++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) && s.charAt(i - 1) == ' ') {
                lastLength = 1;
            } else if (Character.isAlphabetic(s.charAt(i))) {
                lastLength++;
            }
        }
        return lastLength;
    }
}
