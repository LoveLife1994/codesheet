package com.lovelife._125;

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))) {
                j--;
            } else if (s.charAt(i) == s.charAt(j) || Character.toLowerCase(s.charAt(i) ) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
