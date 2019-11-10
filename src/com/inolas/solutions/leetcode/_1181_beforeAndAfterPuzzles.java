package com.inolas.solutions.leetcode;
//JUnit Tests-https://github.com/Inolas/learn-code/blob/master/src/com/inolas/tests/leetcode/_1181_beforeAndAfterPuzzlesTest.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _1181_beforeAndAfterPuzzles
{
    public List<String> beforeAfterPuzzles(List<String> phrases){
        List<String> resultList = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int i = 0;
//        for(int i=0; i<phrases.size(); i++)
        for(String phrase: phrases)
        {
            String[] phraseArray= phrases.get(i).split(" ");
            String lastWord = phraseArray[phraseArray.length-1];
            i++;

            if(phrase.length() > 1){
            resultList = phrases.stream()
                    .filter(s -> s.startsWith(lastWord))
                    .filter(s -> s.indexOf(" ") > 0)
                    .map(s -> s = phrase + s.substring(s.indexOf(" ")))
                    .filter(s -> s != null)
                    .collect(Collectors.toList());

            resultList.forEach(str -> result.add(str));
            }
            else{
                resultList = phrases.stream()
                        .filter(s -> s.equals(lastWord))
//                        .filter(s -> s.indexOf(" ") < 0)
                        .map(s -> s = phrase)
//                        .filter(s -> s != null)
                        .collect(Collectors.toList());

                resultList.forEach(str -> result.add(str));
            }

        }
        Collections.sort(result);
        System.out.println(result);
        return result;
    }

}
