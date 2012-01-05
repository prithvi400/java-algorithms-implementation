package com.jwetherell.algorithms.numbers;

import java.math.BigDecimal;

public class Integers {
    
    public static final String toBinaryUsingDivideAndModulus(int integer) {
        StringBuilder builder = new StringBuilder();
        int temp = 0;
        while (integer>0) {
            temp = integer;
            integer = temp/2;
            builder.append(temp%2);
        }
        return builder.reverse().toString();
    }
    
    public static final String toBinaryUsingShiftsAndModulus(int integer) {
        StringBuilder builder = new StringBuilder();
        int temp = 0;
        while (integer>0) {
            temp = integer;
            integer = (temp>>1);
            builder.append(temp%2);
        }
        return builder.reverse().toString();
    }
    
    public static final String toBinaryUsingBigDecimal(int integer) {
        StringBuilder builder = new StringBuilder();
        BigDecimal zero = new BigDecimal(0);
        BigDecimal two = new BigDecimal(2);
        BigDecimal number = new BigDecimal(integer);
        BigDecimal[] decimals = null;
        while (number.compareTo(zero)>0) {
            decimals = number.divideAndRemainder(two);
            number = decimals[0];
            builder.append(decimals[1]);
        }
        return builder.reverse().toString();
    }
    
    public static final String toBinaryUsingDivideAndDouble(int integer) {
        StringBuilder builder = new StringBuilder();
        double temp = 0d;
        while (integer>0) {
            temp = ((double)integer)/2d;
            integer = (int)temp;
            builder.append((temp>integer)?1:0);
        }
        return builder.reverse().toString();
    }
}
