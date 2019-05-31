package com.inolas.solutions;

import java.util.HashSet;

public class c1_1_IsUnique
{
    public static boolean unique(String str){
        int flag = 0;
        HashSet<String> hs = new HashSet<String>();
        for(char s : str.toCharArray()){
            if(hs.contains(Character.toString(s))){
                flag = 1;
            }else {
                hs.add(Character.toString(s));
            }
        }

        return flag == 0? true : false;
    }

    public static void main(String[] args)
    {
        System.out.println(unique("Saloni"));
        System.out.println(unique("Rachana"));

    }
}
