package com.practice.medium;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        GenerateParenthesis parenthesis = new GenerateParenthesis();
        System.out.println("parenthesis.generateParenthesis(3) = " + parenthesis.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> resultant = new LinkedList<>();
        getRecursiveCombination(n, 0, 0, new StringBuilder(), resultant);
        return resultant;
    }

    private void getRecursiveCombination(int max, int open, int close, StringBuilder inp, List<String> resultant) {
        if(inp.length() == max*2){
            resultant.add(inp.toString());
            return;
        }

        if( open < max ){
            inp.append("(");
            getRecursiveCombination(max,open + 1, close, inp,resultant);
            inp.deleteCharAt(inp.length() - 1);
        }
        if( close < open){
            inp.append(")");
            getRecursiveCombination(max,open, close + 1, inp,resultant);
            inp.deleteCharAt(inp.length() - 1);
        }
    }
}
