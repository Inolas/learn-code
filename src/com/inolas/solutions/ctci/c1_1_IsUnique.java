package com.inolas.solutions.ctci;
import java.util.HashSet;

public class c1_1_IsUnique
{
    public static boolean unique(String str){
        int flag = 0;
        HashSet<String> hs = new HashSet<String>();
        for(char s : str.toCharArray()){
            s = Character.toLowerCase(s);
            if(hs.contains(Character.toString(s))){
                flag = 1;
                return false;
            }else {
                hs.add(Character.toString(s));
            }
        }
        return flag == 0? true : false;
    }
}
