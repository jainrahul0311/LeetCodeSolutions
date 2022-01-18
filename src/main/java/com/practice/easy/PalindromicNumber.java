package com.practice.easy;

public class PalindromicNumber {

    public static void main(String[] args) {
        PalindromicNumber number = new PalindromicNumber();
        System.out.println("number.isPalindrome(1221) = " + number.isPalindrome(1221));
    }

    public boolean isPalindrome(int x) {

        if(x < 0)
            return false;

        int tmp = x;
        int res = 0;

        while(tmp != 0){
            res = res*10 + tmp%10;
            tmp /= 10;
        }

        return res == x;

    }
}
