package com.inolas.solutions.oa;

public class minX
{
    class minx{

    public int minXx(int[] a){
            int minA=0, x=0;
            boolean flag = true;
            while(x==0){
                int sum = x;
                for(int n : a){
                    sum += n;
                    if(sum<1){
                        flag = false;
                    }
                }
                System.out.println(sum+"-"+x);
                if(flag && sum>=0){
                    return x;
                }
                x++;
            }

            return x;
        }
    }
    public static void main(String s[]){
        int[] a = {-2,3,1,-5};
        // System.out.println(minXx(a));

        int minA=0, x=0;
        boolean flag = true;
        while(x==0){
            int sum = x;
            for(int n : a){
                sum += n;
                if(sum<1){
                    flag = false;
                }
            }
            System.out.println(sum+"-"+x);
            if(flag && sum>=0){
                System.out.println("---"+x);
            }
            x++;
        }

        System.out.println("==-"+x);
    }
}
