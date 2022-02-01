package com.practice.medium;

import java.util.Arrays;

public class DailyTemperatures {

    public static void main(String[] args) {
        DailyTemperatures temperatures = new DailyTemperatures();
        System.out.println("temperatures.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}) = " + Arrays.toString(temperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    public int[] dailyTemperatures(int[] t) {

        int[] res = new int[t.length];

        int i;
        int j;

        for(i = 0; i < t.length - 1; i++){
            for(j = i + 1; j < t.length; j++){
                if(t[j] > t[i]){
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }
    
    
}
