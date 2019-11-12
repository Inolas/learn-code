package com.inolas.solutions.interview_assesments.Nut;

import java.util.Collections;
import java.util.HashMap;

public class _gumballMachine
{
    public float minimumWastageCost(String[] dailyDelivery){
        HashMap<String, Integer> gumball_machines = new HashMap<>();
        float wastage = 0;

        for (int i = 0; i < dailyDelivery.length; i++){
            if(gumball_machines.containsKey(dailyDelivery[i])){
                gumball_machines.replace(dailyDelivery[i], 1000);
            }
            else if(gumball_machines.size() == 3){
                wastage += Collections.min(gumball_machines.values());
                gumball_machines.remove(Collections.min(gumball_machines.keySet()));

                gumball_machines.put(dailyDelivery[i], 1000);
            }
            else {
                gumball_machines.put(dailyDelivery[i], 1000);
            }
            //Decrement 10 from each at the end of the day
            gumball_machines.replaceAll((color, count) -> count -= 10);
        }
        float cost = wastage / 100;
        return cost;
    }
}
