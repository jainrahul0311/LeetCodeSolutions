package com.practice.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        int target = 9;

        System.out.println("twoSum(input,target) = " + Arrays.toString(twoSum(input, target)));

        input = new int[]{3,2,4};
        target = 6;

        System.out.println("twoSum(input,target) = " + Arrays.toString(twoSum(input, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
            if(hmap.containsKey(nums[i]))
                return new int[]{hmap.get(nums[i]),i};
            else
                hmap.put(target - nums[i],i);

        return new int[]{-1,-1};
    }
}
