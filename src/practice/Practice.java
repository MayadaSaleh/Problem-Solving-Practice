/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import leetcode.LongestCommonPrefix;


/**
 *
 * @author Mayada
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LongestCommonPrefix longestCommen = new LongestCommonPrefix();
        String[] strs = {};
        String commonPrefix = longestCommen.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix is " + commonPrefix);
    }

}
