package com.fishpan.offer.number;

/**
 * 数字反转
 */
public class Number {
    public static void main(String[] args) {
        System.out.println(-123 % 10);

        System.out.println("" + reverseNumber(-123));
    }

    private static int reverseNumber(int number) {
        int n = 0;
        while (number != 0) {
            n = n * 10 + number % 10;
            number /= 10;
        }
        return n;
    }
}
