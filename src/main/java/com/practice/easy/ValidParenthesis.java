package com.practice.easy;

import java.util.ArrayDeque;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis parenthesis = new ValidParenthesis();
        System.out.println(parenthesis.isValid("()[]{}"));
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.empty())
                stack.push(s.charAt(i));
            else if(stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '[' && s.charAt(i) == ']' || stack.peek() == '{' && s.charAt(i) == '}')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }

        return stack.empty();
    }

}
