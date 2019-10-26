package com.inolas.solutions.leetcode;

import java.util.Scanner;

public class _509_FibonnaciNumber
{
    public static int option = 0;
    public static int fib(int N){
        if(N < 2)   return N;
        if(option == 1)
            return fib(N-1) + fib(N-2);

        if(option == 2)
//            return fib_BU_memoize(N);
            return BU_memo(N);
        return 0;
    }
    /*
    * Finding Fibonacci number with Bottom-Up approach using memoization
    * */
    public static int fib_BU_memoize(int N){

        return BU_memo(N);
    }
    public static int BU_memo(int N){
        int[] cache = new int[N+1];
//        cache[0] = 0;
        cache[1] = 1;
        for(int i=2; i<N+1; i++)
            cache[i] = cache[i-1] + cache[i-2];
        return cache[N];
    }

    public int fib_math(int N){
        double goldenRatio = (1 + Math.sqrt(5) ) / 2;
        int fib = (int) Math.round(Math.pow(goldenRatio, 2)/ Math.sqrt(5));
        return fib;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1) for recursive, 2) Bottom-Up Approach");
        option = sc.nextInt();
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));

    }
}
