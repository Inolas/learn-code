package com.inolas.solutions.sorting;

import com.inolas.classes.ListNode;

public class mergeSort
{
    public void mergeSort(int[] array, int left, int right){

        int mid = (left + right) / 2;

        if(left < right)
        {
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);

        }
    }
    ListNode mergeSort(ListNode head){

        return null;
    }
    public void merge(int[] array, int left, int mid, int right){
        System.out.println(this.printArray(array));

        int[] leftArray = new int[mid - left + 1];
        for (int i = 0; i < mid - left + 1; i++)
        {
            leftArray[i] = array[left+i];
        }
        int[] rightArray = new int[right - mid];
        for (int i = 0; i < right - mid; i++)
        {
            rightArray[i] = array[mid+1+i];
        }
        int i=0, j=0;
        int k = left;

        while(i < (left - mid + 1) && j < (right - mid))
        {
            if(leftArray[i] < rightArray[j])
            {
                array[k] = leftArray[i];
                i++;
            }
            else
            {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < (mid - left + 1))
        {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < (right - mid))
        {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public String printArray(int[] array)
    {
        String strArray="";
        int n = array.length;
        for (int i=0; i<n; ++i)
            strArray += array[i] + " ";
        return strArray;
    }
}

