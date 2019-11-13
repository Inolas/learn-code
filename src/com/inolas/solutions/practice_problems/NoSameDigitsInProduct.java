package com.inolas.solutions.practice_problems;

import java.util.HashSet;
import java.util.Set;

/*
* Count numbers in range such that digits in it and it’s product with q are unequal
* Given a range of numbers [l, r] and an integer q.
* The task is to count all such number in the given range such that any digit
* of the number does not match with any digit in its product with the given number q.
* Examples:
*
* Input : l = 10, r = 12, q = 2
* Output : 1
* 10*2 = 20 which has 0 as same digit
* 12*2 = 24 which as 2 as same digit
* 11*2 = 22 no same digit
*
* Input : l = 5, r = 15, q = 2
* Output : 9
* */
public class NoSameDigitsInProduct
{
    public int count(int l, int r, int q){
        int count=0;
        Integer product;
        Set<Character> product_set = new HashSet<>();

        for (int i = l; i <= r ; i++)
        {
            int flag=0;
            product_set.clear();
            product = i * q;
            Integer ii = i;
            String sb_l = ii.toString();
//            StringBuilder sb_l = new StringBuilder(i.);
            int len = product.toString().length();

            for(int p = 0; p < len; p++)
                product_set.add(product.toString().charAt(p));

            for (int j = 0; j < sb_l.length(); j++)
            {
                char c = sb_l.charAt(j);
                if(product_set.contains(c))
                {
                   flag = 1;
                   continue;
                }
            }
            if(flag!=1)
                count++;
        }
        return count;
    }
}
