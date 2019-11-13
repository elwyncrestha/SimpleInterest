package com.elvin.simpleinterest.model;

public class Arithmetic {

    public static float SI(float principal, float time, float rate) {
        return (principal * time * rate) / 100;
    }

    public static float areaOfCircle(float radius) {
        return (float) Math.PI * radius * radius;
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num % 10 != 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        return reverse;
    }

    public static int[] swapNumber(int first, int second) {
        first = first + second;
        second = first - second;
        first = first - second;
        return new int[]{first, second};
    }

    public static boolean palindromeNumber(int number) {
        return number == reverseNumber(number);
    }
}
