package com.inolas.solutions.dcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class dcp_205_nextPermutation
{
    public String nextPermut(int num){

        int[] resultList = intToArray(num);

        int i = resultList.length - 2;
        int j = resultList.length - 1;

        while (i >= 0 && resultList[i + 1] <= resultList[i]) {
            i--;
        }
        if (i >= 0) {
            //Finding the next smallest number to array[i]
            while (j >= 0 && resultList[j] <= resultList[i]) {
                j--;
            }
            swap(resultList, i, j);
        }
        resultList = reverseArray(resultList, i + 1);

        String resNum = Arrays.toString(resultList);

        return resNum;
    }

    public List<Integer> intToList(int number){
        int num = number;
        List<Integer> numList = new ArrayList<>();

        while(num != 0){
             numList.add(0,num % 10);
            num = num / 10;
        }
        return numList;
    }

    public int[] intToArray(int number){
        int num = number;
        int count = 0;
        while(num != 0){
            num = num / 10;
            count ++;
        }

        int[] numList = new int[count];
        int i = count;
        num = number;
        while(num != 0){
            numList[--i] = num % 10;
            num = num / 10;
        }

        return numList;
    }

    public int[] reverseArray(int[] array, int start){
        for(int i=start, j=array.length-1 ; i < j; i++, j--){
            array = swap(array, i, j);
        }

        return array;
    }

    public int[] swap(int[] array, int i, int j){
        int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }
}
