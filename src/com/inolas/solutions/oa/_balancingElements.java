package com.inolas.solutions.oa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
* Time exceeded
* */
public class _balancingElements
{
    public static int countBalancingElements(List<Integer> list){
        int counter=0;
        for(int i=0;i<list.size();i++)
        {
            int temp1=list.remove(i);

            Integer sum = list.stream()
                    .collect(Collectors.summingInt(Integer::intValue));

            int sumeven=0,sumodd=0;
            for(int ii=0;ii<list.size()/2;ii++)
            {
                int evenIndex = (ii+1)*2;
                int value=list.get(evenIndex-1);
                sumeven += value;
            }
            sumodd = sum - sumeven;

            boolean check = sumeven==sumodd? true: false;

            if(check)
            {
                counter++;
            }
            list.add(i,temp1);
        }
        return counter;
    }
    public static boolean balance(List<Integer> temp)
    {
        int sumeven=0,sumodd=0;
        for(int i=0;i<temp.size();i++)
        {
            int value=temp.get(i);
            if(i%2==0)
            {
                sumeven+=value;
            }
            else
            {
                sumodd+=value;
            }
        }
        return sumeven==sumodd? true: false;

    }
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<Integer>();
        //initialize an array list

        list.add(2); list.add(1); list.add(6); list.add(4); //1
//        list.add(2); list.add(2); list.add(2);//3
//        list.add(5);list.add(5);list.add(2);list.add(5);list.add(8);//2

        System.out.println(countBalancingElements(list));
    }
}
