package com.inolas.solutions.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_letterCombinationsOfAPhoneNo
{
    public static List<String> letterCombinations(String digits) {
        Map<String, String> phone = new HashMap<String, String>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};
        return null;
    }

    static List<String> combinations(List<String> combinations, String digits){
        if(digits.length()==0)
            return combinations;
        else if(digits.length()==1)
            return combinations;

        return combinations(combinations, digits);
    }
    public static void main(String[] args){
        combinations(new ArrayList<>(),"234");
    }
}
