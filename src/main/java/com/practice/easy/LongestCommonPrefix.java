package com.practice.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] inp = new String[]{"flower","flow","flight"};
        System.out.println("prefix = " + prefix.longestCommonPrefix(inp));
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }

}
