/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.calculator;

import java.util.ArrayList;

/**
 *
 * @author wing
 */
public class ComCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        
        maths.sum((int)a.get(0), (int)a.get(1));
        
        System.out.println(" 1 + 2 = %d" + 
                Integer.toString(maths.sum((int)a.get(0), (int)a.get(1))));
        
        System.out.println(" 1 + 2 = %d" + 
                Integer.toString(maths.sum(a)));
        
    }
    
}
