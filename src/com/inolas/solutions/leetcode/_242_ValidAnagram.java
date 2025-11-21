package com.inolas.solutions.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _242_ValidAnagram
{

    public static boolean isAnagram(String input1, String input2){
        HashMap<String, Integer> charCountHM = new HashMap<>();
        for (char c : input1.toCharArray()) {
            if(charCountHM.containsKey(c)) {
                int count = charCountHM.get(c);
                charCountHM.replace(Character.toString(c), ++count);
            } else {
                charCountHM.put(Character.toString(c), 1);
            }
        }

        int oddCount = 0;
        for (String item : charCountHM.keySet()) {
            if(charCountHM.get(item) % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount > 1 ? false : true;
    }

    public static boolean isAnagram(String inputs, String inputt, int k) {
        if(inputs.length() != inputt.length()) return false;
        char[] s = inputs.toCharArray();
        char[] t = inputt.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);

        for (int i = 0; i < s.length; i++) {
            if(s[i] != t[i]) return false;
        }
        return true;
    }
}
