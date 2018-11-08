package com.yevheniiparfonov.hw15.task2;

import java.util.Arrays;

public class Fibonacci {

    public static int[] fiboByCycle(int n) {
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

    public static int[] fiboByRecursion(int n) {
        int[] array = new int[n];
        fiboByRecursion(n, array);
        return array;
    }

    public static int fiboByRecursion(int n, int[] array) {
        if (n == 1) {
            array[n - 1] = 1;
            return 1;
        }
        if (n == 2) {
            array[n - 1] = 1;
            return fiboByRecursion(n - 1, array);
        } else {
            array[n - 1] = fiboByRecursion(n - 1, array) + fiboByRecursion(n - 2, array);
            ;
            return array[n - 1];
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fiboByCycle(11)));
        System.out.println(Arrays.toString(fiboByRecursion(11)));


    }
}
