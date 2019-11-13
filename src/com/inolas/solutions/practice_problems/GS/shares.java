package com.inolas.solutions.practice_problems.GS;

import java.util.HashSet;
import java.util.Set;

public class shares
{
    public static long analyzeInvestments(String s) {
        // Write your code here
        long result = 0;

        for(int i =0; i< s.length()-2 ; i++){
//            Map<Character, Integer> map = new HashMap<>();
            Set<Character> map = new HashSet();
            int j = i;
            while(j < s.length()){
                Character ch = s.charAt(j);
                if(ch == 'A' || ch =='B' || ch =='C') {
                    map.add(ch);
//                    map.put(ch, map.getOrDefault(ch, 0)+1);
                }
                if(map.size() == 3) {
                    result += (s.length() - j);
                    break;
                }
                j++;
            }

        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(analyzeInvestments("ABCCBA"));
        System.out.println(analyzeInvestments("ABBCZBAC"));
    }

}
