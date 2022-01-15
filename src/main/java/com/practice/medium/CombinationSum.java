package com.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombinationSum {

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        System.out.println("cs.combinationSum(new int[]{2,3,6,7},7) = " + cs.combinationSum(new int[]{2,3,6,7},7));
        System.out.println("cs.combinationSum(new int[]{2,3,5},8) = " + cs.combinationSum(new int[]{2,3,5},8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(candidates);
        doRecursiveSum(candidates,0 ,target,new LinkedList<Integer>(),result);
        return result;
    }

    private void doRecursiveSum(int[] candidates,int idx,int target, LinkedList<Integer> curInp,List<List<Integer>> result) {

        if(target == 0){
            result.add(new LinkedList<>(curInp));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            int candidate = candidates[i];

            if (candidate <= target){
                curInp.add(candidate);
                doRecursiveSum(candidates, i,target - candidate, curInp, result);
                curInp.removeLast();
            }
        }
    }


}
