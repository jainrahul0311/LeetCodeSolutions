package com.practice.medium;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int  l = 0;
        int r = height.length - 1;

        int max = Integer.MIN_VALUE;

        while ( l < r){
            max = Math.max(Math.min(height[l],height[r]) * Math.abs(l - r) , max);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater water = new ContainerWithMostWater();
        System.out.println("water.maxArea(new int[]{1,8,6,2,5,4,8,3,7}) = " + water.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));;
    }
}
