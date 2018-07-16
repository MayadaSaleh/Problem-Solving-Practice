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
public class ArrayElement implements Comparable<ArrayElement>{
    
   private int element;
   private int frequency;
    
    public ArrayElement(int element, int frequency){
        this.element = element;
        this.frequency = frequency;
    }

    public int getElement() {
        return element;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(ArrayElement t) {
            return t.frequency - this.frequency;
    }
    
    
    
}
