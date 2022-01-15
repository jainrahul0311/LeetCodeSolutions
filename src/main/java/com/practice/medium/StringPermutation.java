package com.practice.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {

        StringPermutation permutation = new StringPermutation();

        List<List<Integer>> permute = permutation.permute(new int[]{1, 2, 3});
        System.out.println("permute = " + permute);


    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();

        ArrayList<Integer> input = new ArrayList<>();
        for (int i : nums)
            input.add(i);

        doRecursivePermutation(0,input,list,input.size());
        return list;
    }

    private void doRecursivePermutation(int curIdx, ArrayList<Integer> input, List<List<Integer>> result, int size) {

        if(curIdx == size){
            result.add(new ArrayList<>(input));
        }

        for (int i = curIdx; i < size; i++) {
            Collections.swap(input,curIdx,i);
            doRecursivePermutation(curIdx + 1,input,result,size);
            Collections.swap(input,curIdx,i);
        }
    }

}
