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
public class ReverseString {

    public String reverseString(String s) {

        String result = null;
        char[] charArray = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            charArray[i] = s.charAt(s.length() - i - 1);
            charArray[s.length() - i - 1] = s.charAt(i);
        }
        result = String.valueOf(charArray);
        return result;
    }
}
