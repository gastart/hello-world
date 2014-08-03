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
public class maths {
    public static int sum(final int a, final int b) {
        int result = a + b;
        return result;
    }
    
    public static int sum(final ArrayList<Integer> sums) {
        int value = 0;
        for (Integer sum : sums) {
            value += sum;
        }
        return value;
    }
}
