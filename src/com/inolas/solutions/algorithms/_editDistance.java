package com.inolas.solutions.algorithms;

/*
* remove/delete - 1 (cart - cat); add - 1 (far - fart); change - 2 (cat - fat);
* */

public class _editDistance
{
    public static int editDistance(String u, String v){

        int[][] distanceMatrix = new int[u.length()+1][v.length()+1];

        for(int i=0; i<=u.length(); i++){
            for(int j=0; j<=v.length(); j++){
                int value = 0;
                if(i==0 && j==0)
                    value = 0;
                else if(i==0)
                    value = j;
                else if(j==0)
                    value = i;
                else
                    value = minimum(distanceMatrix[i-1][j] + 1, distanceMatrix[i][j-1] + 1, distanceMatrix[i-1][j-1]+ (u.charAt(i-1) == v.charAt(j-1)? 0 : 2));
                distanceMatrix[i][j] = value;
            }
        }

        return distanceMatrix[u.length()][v.length()];
    }
    public static int minimum(int a, int b, int c){
        int min;
        min = c < b ? (c < a ? c : a) : (a < b ? a : b);
        return min;
    }
    public static void main(String[] args)
    {
        System.out.println(_editDistance.editDistance("fast", "cats"));
        System.out.println(_editDistance.editDistance("heat", "hit"));
    }
}
