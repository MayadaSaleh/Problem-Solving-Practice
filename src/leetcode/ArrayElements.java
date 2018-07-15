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
public class ArrayElements implements Comparable<ArrayElements>{
    
    int element;
    int frequency;
    
    public ArrayElements(int element, int frequency){
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
    public int compareTo(ArrayElements t) {
            return t.frequency - this.frequency;
    }
    
    
    
}
