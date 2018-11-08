package com.yevheniiparfonov.hw15.task2;

public class Calculator {
    public static final double PI = 3.14;

    static double sum(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b){
        return  a - b;
    }

    static double multiply(double a, double b){
        return  a * b;
    }

    static double pow(double a, int b){
        double result = a;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return  result;
    }


    public static void main(String[] args) {
        int r = 8;
        System.out.println(multiply(2, multiply(PI, r)));
    }
}
