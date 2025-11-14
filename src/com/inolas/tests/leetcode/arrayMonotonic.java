package com.inolas.tests.leetcode;

public class arrayMonotonic
{
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,2,1};
    int[] result = arrayMonotonic(array, 3);
    for (int r : result) {
      System.out.println(r);
    }
  }
  public static int[] arrayMonotonic(int[] array, int d){
      int n = array.length;
      int[] result = new int[n-d+1];
      int x=0;
    for (int i=0; i < n-d+1; i++) {
      int j = i+d-1;
      boolean res = isMonotonic(array, i, j);
      result[i] = res ? 1 : 0;//ternary operator
      j++;
    }
    return result;
  }
  public static boolean isMonotonic(int[] array, int i, int j){
      boolean isNonIncreasing = true;
      boolean isNonDecreasing = true;
      for(int k = i+1; k < j+1; k++){
          System.out.println("i:"+array[i]+"k:"+ array[k]);
          if(array[k] < array[k-1]){
              isNonDecreasing = false;
          }
          if(array[k] > array[k-1]){
              isNonIncreasing = false;
          }
      }
      return isNonDecreasing || isNonIncreasing;
  }
}
