package com.inolas.solutions.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _1181_beforeAndAfterPuzzles
{
    public List<String> before_after_puzzles(List<String> phrases){
        List<String> result_list = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int i = 0;
//        for(int i=0; i<phrases.size(); i++)
        for(String phrase: phrases)
        {
            String[] phrase_array= phrases.get(i).split(" ");
            String last_word = phrase_array[phrase_array.length-1];
            i++;

            result_list = phrases.stream()
                    .filter(s -> s.startsWith(last_word))
                    .filter(s -> s.indexOf(" ") > 0)
                    .map(s -> s = phrase + s.substring(s.indexOf(" ")))
                    .filter(s -> s != null)
                    .collect(Collectors.toList());

//            result = result_list.stream()
//                    .flatMap(s .stream())
//            .collect(Collectors.toList());
//
            result_list.forEach(str -> result.add(str));

        }
        Collections.sort(result);
        System.out.println(result);
        return result;
    }

}
