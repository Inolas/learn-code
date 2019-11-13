package com.inolas.solutions.practice_problems.Nut;

import java.util.*;

public class _desiBinaryNumbers
{
    public void solve(int n)
    {
        int decimal_no = n;
        List<Integer> result_deci_binary = new ArrayList<>();
        int n_len = num_length(n);
        Integer[] binary_set = binary_set((int)Math.pow(2, n_len) - 1);
        while (decimal_no != 0)
        {
            int deci_binary_no = 0;
            for(int i = binary_set.length-1; i >= 0; i--){
                if(decimal_no >= binary_set[i]){
                    deci_binary_no = binary_set[i];
                    break;
                }
            }
            decimal_no = decimal_no - deci_binary_no;
            result_deci_binary.add(deci_binary_no);

        }
        System.out.println(result_deci_binary.size());
        Collections.sort(result_deci_binary);
        for (int i: result_deci_binary)
        {
            System.out.print(i+" ");
        }
//        System.out.println(result_deci_binary);
    }

    public int num_length(int n)
    {
        int length = 0;
        while (n != 0)
        {
            n = n / 10;
            length++;
        }
        return length;
    }

    public Integer[] binary_set(int n)
    {
        List<Integer> binary_set = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");
        while (n-- > 0)
        {
            String s1 = q.peek();
            q.remove();

            binary_set.add(Integer.parseInt(s1));
            String s2 = s1;

            q.add(s1 + "0");
            q.add(s2 + "1");
        }
        Integer[] set = binary_set.stream().toArray(Integer[] ::new);
        return set;
    }
}