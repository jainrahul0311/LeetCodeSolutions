package com.practice.medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        DailyTemperatures temperatures = new DailyTemperatures();
        System.out.println("temperatures.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}) = " + Arrays.toString(temperatures.dailyTempMonoStack(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
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

    //Monotonic Stack
    public int[] dailyTempMonoStack(int[] t){

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[t.length];

        for (int i = 0; i < t.length; i++) {

            while (!stack.isEmpty() && t[stack.peek()] < t[i]){
                int tmp = stack.pop();
                res[tmp] = i - tmp;
            }

            stack.push(i);
        }

        return res;
    }
    
}
