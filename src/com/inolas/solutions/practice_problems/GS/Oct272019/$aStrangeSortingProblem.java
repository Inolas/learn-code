package com.inolas.solutions.practice_problems.GS.Oct272019;

import java.util.*;

public class $aStrangeSortingProblem
{
    public static List<String> strangeSort(List<Integer> mapping, List<String> nums) {
        // Write your code here
        Set<String> result = new HashSet<>();
        HashMap<String, Integer> mapped_values = new HashMap<>();

        for (String s : nums)
        {
            StringBuilder mapped_value = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
            {
                int map = s.charAt(i) - '0';
                mapped_value.append(mapping.indexOf(map));
            }
            mapped_values.put(s, Integer.parseInt(mapped_value.toString()));
        }

        Map<String, Integer> map = new TreeMap<String, Integer>(mapped_values);

        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mapp = (Map.Entry)iterator2.next();
//            System.out.print(me2.getKey() + ": ");
//            System.out.println(me2.getValue());
//            result.add(mapp.getKey());

        }

//        int i=0;
//        List<String> result = new ArrayList<>();
//        for (Map.Entry<String, Integer> mapp : sorted_map) {
//            result.add(i, mapp.getKey());
//            i++;
//        }
        return null;

    }

    public static void main(String[] args)
    {
//        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li1 =new ArrayList<>();

        li1.add(3); li1.add(5); li1.add(4); li1.add(6); li1.add(2);
        li1.add(7); li1.add(9); li1.add(8); li1.add(0); li1.add(1);

        List<String> nums =new ArrayList<>();
        nums.add("990"); nums.add("332"); nums.add("32");

        strangeSort(li1, nums);
    }
}
