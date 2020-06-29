package com.lovelife._344;

class Solution {
    public void reverseString(char[] s) {
        int i = 0;int j = s.length - 1;
        char tmp;
        while (i < j) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
