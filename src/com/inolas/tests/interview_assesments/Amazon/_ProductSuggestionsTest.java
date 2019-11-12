package com.inolas.tests.interview_assesments.Amazon;

import com.inolas.solutions.interview_assesments.Amazon._0_ProductSuggestions;
import org.junit.Test;

public class _ProductSuggestionsTest
{
    _0_ProductSuggestions ps = new _0_ProductSuggestions();
    @Test
    public void test1(){
        //List<String> repository = Arrays.asList("monitor", "mouse", "mousepad", "moblie", "moneypot");
        String[] reposito = {"monitor", "mouse", "mousepad", "moblie", "moneypot"};
        System.out.println(ps.productSuggestions(reposito, "mouse"));
    }

}