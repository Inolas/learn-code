package com.inolas.solutions.practice_problems.sg.Oct272019;

import java.util.*;

public class matrixGame
{
    public static int play(List<List<Integer>> arr) {
        // Write your code here
        int tom = 0, jerry = 0, turn=0;
        Set<Integer> active_columns = new HashSet<>();
        int size = arr.get(0).size();
        for (int i = 0; i < size ; i++)
        {
            active_columns.add(i);
        }
        ArrayList<Integer> non_repetitiveNo = new ArrayList<>();

        for(int i=0; i < arr.size(); i++){
            for(int j=0; j < arr.get(0).size(); j++){
                if(!non_repetitiveNo.contains(arr.get(i).get(j))){
                    non_repetitiveNo.add(arr.get(i).get(j));
                }
            }
        }
        Collections.sort(non_repetitiveNo, Collections.reverseOrder());
        int high_avail_score = 0;
        while(!active_columns.isEmpty())
        {
            int flag = 0;
/*
* One turn - check the highest value avali. If in one turn if you don't get the highest value
* then higest_avail_score++; for that lest use flag. shittty code
* */
            for (int i = 0; i < arr.size(); i++)
            {
                for (int j = 0; j < arr.get(0).size(); j++)
                {
                    if(active_columns.contains(j))
                    {
                        if (arr.get(i).get(j) == non_repetitiveNo.get(high_avail_score))
                        {
                            active_columns.remove(j);
                            flag = 1;
                            if(turn%2 == 0){
                                tom += arr.get(i).get(j);

//                                System.out.println("Tom"+tom+"-("+i+","+j+")");
                            }
                            else{
                                jerry += arr.get(i).get(j);
//                                System.out.println("Jer"+jerry+"-("+i+","+j+")");
                            }
                            turn++;
                        }
                    }
                }
            }
            if(flag == 0){
                high_avail_score++;
            }
//            System.out.println(arr.contains(high_avail_score)+"dj");
//            high_avail_score++;

        }

        return tom - jerry;
    }

    public static void main(String[] args)
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li1 =new ArrayList<>();

        /*
        * 5 7 6 2 8 4 4 8
        * 2 5 4 5 9 8 4 2
        * 5 4 3 9 8 3 3 4
        * 4 9 3 4 6 7 4 9
        * 2 4 6 2 9 2 4 2
        * */
        li1.add(5); li1.add(7); li1.add(6); li1.add(2); li1.add(8); li1.add(4); li1.add(4); li1.add(8);
        list.add(li1);
        List<Integer> li2 =new ArrayList<>();
        li2.add(2); li2.add(5); li2.add(4); li2.add(5); li2.add(9); li2.add(8); li2.add(4); li2.add(2);
        list.add(li2);
        List<Integer> li3 =new ArrayList<>();
        li3.add(5); li3.add(4); li3.add(3); li3.add(9); li3.add(8); li3.add(3); li3.add(3); li3.add(4);
        list.add(li3);
        List<Integer> li4 =new ArrayList<>();
        li4.add(4); li4.add(9); li4.add(3); li4.add(4); li4.add(6); li4.add(7); li4.add(4); li4.add(9);
        list.add(li4);
        List<Integer> li5 =new ArrayList<>();
        li5.add(2); li5.add(4); li5.add(6); li5.add(2); li5.add(9); li5.add(2); li5.add(4); li5.add(2);
        list.add(li5);

        System.out.println(play(list));
    }
}
