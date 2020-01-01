package com.inolas.solutions.algorithms;

/*
* remove/delete = 1 (cart - cat); add = 1 (far - fart); change = 2 (cat - fat);
* This approach uses memoization.
* Storing the edit distance of each word in a 2D matrix fashion.
* Complexity - O(n*m) :: n - length of first word; m - length of second word
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
//                    minimum of top value + 1 (add); left value + 1 (delete) and diagonal values + 2 if the letter is not same(change).
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
        System.out.println(_editDistance.editDistance("hot", "hit"));
    }
}
