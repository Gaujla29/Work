package com.sparta.ga;

public class Fib {

    public void Fibonacci(int x) {
        int x1 = 0, x2 = 1;


        for (int i = 1; i <= x; ++i) {
            System.out.println(x1);

            int x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
        }
    }
}