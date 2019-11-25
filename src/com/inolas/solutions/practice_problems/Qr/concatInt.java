package com.inolas.solutions.practice_problems.Qr;

public class concatInt
{
    public static long concatenationsSum(int[] a) {
        long sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                Long ai = (long)a[i];
                Long aj = (long)a[j];
                sum += Long.parseLong(ai.toString().concat(aj.toString()));
                System.out.println(a[i]+" "+a[j]);
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
//        concatenation
    }

}
