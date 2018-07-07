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
public class PlusOne {
  
     public int[] plusOne(int[] digits) {
        
        int multiplier = 1;
        int number =0;
        for(int i=1; i< digits.length ; i ++)
        {
            multiplier = multiplier *10;
        }
                    
        for ( int i=0 ; i < digits.length ; i ++)
        {
        number = number + multiplier * digits [i];
        multiplier /= 10; 
        }
        number += 1;
        String stringNumber = Integer.toString(number);
        int [ ] result = new int [stringNumber.length ()];
        for ( int j=0; j <result.length ; j++)
        {
        result [j] = stringNumber.charAt(j) - '0';
        }

        return result ;
        
    }
        
}
