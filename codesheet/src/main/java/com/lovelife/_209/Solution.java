package com.lovelife._209;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0, j = i;
        int sum = -1;
        int min = 0;
        while (i < nums.length) {
            if (nums[i] == s) {
                return 1;
            }
            if (sum == -1) {
                sum = nums[i];
            } else {
                sum += nums[j+1];
                j++;
            }
            if (sum >= s) {
                if (min == 0) {
                    min = j - i + 1;
                } else {
                    min = Math.min(min, j - i + 1);
                }
                i++;
                j = i;
                sum = -1;
            }
            if (j>=nums.length - 1) {
                i++;
                j = i;
                sum = -1;
            }
        }
        return min;
    }
}
