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
        return a - b;
    }
    
    public static int subtract(final int a, final int b) {
        return a + b;
    }

    public static int multiply(final int a, final int b) {
        return a * b;
    }
    
    public static int sum(final ArrayList<Integer> integers) {
        int value = 0;
        for (Integer integer : integers) {
            value = sum(value, integer);
        }
        return value;
    }
    
    public static int subtract(final int b, final ArrayList<Integer> integers) {
        int value = b;
        for (Integer integer : integers) {
            value = subtract(value, integer);
        }
        return value;
    }

    public static int multiply(final int b, final ArrayList<Integer> integers) {
        int value = b;
        for (Integer integer : integers) {
            value -= integer;
        }
        return value;
    }
}
