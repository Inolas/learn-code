// Click on "HELP" above to see examples of handling input/debug/output
// Format the output as specified in the problem statement and write the result to stdout
// IMPORTANT: Remove all debug statements for your final submission
package com.inolas.solutions.interview_assesments.Nut;

public class _grumpyBookstoreOwner {

    public static int solution(int p, int[] x, int[] r){
        // Write your code here

        int startIndex = startIndexOfMaximumCustomerswhenJGrumpy(x,r);
        int noGrumpEnd = startIndex + p - 1;

        r = useSecret(r, startIndex, noGrumpEnd);

        return sum_customers(x, r);

        // return -1;
    }

    public static int sum_customers(int[] x, int[] r){
        int sum = 0;

        for(int i = 0; i < x.length; i++){
            if(r[i] != 0){
                sum += x[i];
            }
        }
        return sum;
    }

    //replace all 0 in int[] r to 1 when John uses the secret
    public static int[] useSecret(int[] r, int start, int end){
        for(int i = 0; i < r.length; i++){
            if(i >= start && i <= end){
                r[i] = 1;
            }
        }
        return r;
    }

    //Calculating the subset that gives maximum number of customer when John is grumpy.
    //This will help to decide the start time of the secret technique.
    public static int startIndexOfMaximumCustomerswhenJGrumpy(int[] x, int[] r){
        int k, maxStart=0, maxEnd=x.length-1;

        for( k = 0; k < r.length; k++){
            if(r[k] == 0){
                maxStart = k;
                break;
            }
        }

        int maxSum = x[maxStart];
        int currMax = x[maxStart];

        for(int i = k; i < x.length; i++){
            if(r[i] == 0){
                currMax = ((currMax + x[i]) > x[i] ? (currMax + x[i]) : x[i]);

                if((currMax + x[i]) < x[i]){
                    maxStart = i;
                }

                maxSum = (maxSum > currMax ? maxSum : currMax);
                if(maxSum < currMax){
                    maxEnd = i;
                }
            }
        }
        // return new int[]{maxStart, maxEnd};
        return maxStart;

    }
    //    public static void main(String[] args) {
    //        Scanner in = new Scanner(System.in);
    //        int t = in.nextInt();
    //        int p = in.nextInt();
    //        int[] x = new int[t];
    //        int[] r = new int[t];
    //        for(int i=0; i<t; i++){
    //            x[i]=in.nextInt();
    //        }
    //        for(int i=0; i<t; i++){
    //            r[i]=in.nextInt();
    //        }
    //        System.out.println(solution(p, x, r));
    //    }

}
