package com.inolas.solutions.interview_assesments;

import java.util.HashMap;

public class $CutCommonality
{
    public int max_cut_commonality(String str){

        HashMap<Character, Integer> input_str = new HashMap<>();

        for(char ch : str.toCharArray()) {
            if(input_str.containsKey(ch))
                input_str.replace(ch, input_str.get(ch)+1);
            else
                input_str.put(ch, 1);
        }

        int max_cut = 0;
        int cut = 0;
        for(int i=0; i<str.length(); ++i) {
            char char_i = str.charAt(i);
            if(input_str.get(char_i) > 1){
                cut++;
                input_str.replace(char_i, input_str.get(char_i) - 2);
            } else if (input_str.get(char_i) == 0) {
                cut--;
            } else {
                input_str.replace(char_i, input_str.get(char_i)-1);
            }
            max_cut = Math.max(cut, max_cut);
        }
        return max_cut;
    }
    public int chararray_cut(String str){
        int[] count = new int[26];
        for(char ch : str.toCharArray()) {
            count[ch-'a']++;
        }
        int res = 0;
        int cur = 0;
        for(int i=0; i<str.length(); ++i) {
            if(count[str.charAt(i)-'a'] > 1) {
                ++cur;
                count[str.charAt(i)-'a'] -= 2;
            } else if (count[str.charAt(i)-'a'] == 0) {
                --cur;
            } else {
                --count[str.charAt(i)-'a'];
            }
            res = Math.max(cur, res);
        }
        return res;
    }
}
