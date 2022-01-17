package com.practice.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacter lswrc = new LongestSubstringWithoutRepeatingCharacter();
        System.out.println("lswrc.lengthOfLongestSubstring(\"abcabcbb\") = " + lswrc.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int result = 0;
        HashSet<Character> chars = new HashSet<>();

        while(right < s.length()) {

            if(!chars.contains(s.charAt(right))) {
                chars.add(s.charAt(right));
                result = Math.max(result, chars.size());
                right++;
            } else {
                left ++;
                right = left;
                chars.clear();
            }
        }
        return result;
    }
}
