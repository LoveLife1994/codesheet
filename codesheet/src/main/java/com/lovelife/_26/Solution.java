package com.lovelife._26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j;
        int len = nums.length;
        for (i = 0, j = i + 1; i < len && j < len;) {
            if (nums[j] == nums[i]) {
                j++;
                continue;
            }
            if (j - i > 1) {
                for (int k = j; k < len; k++) {
                    nums[k - j + i + 1] = nums[k];
                }
                len = len - j + i + 1;
            }
            i++;
            j = i + 1;
        }
        if (j - i > 1) {
            for (int k = j; k < len; k++) {
                nums[k - j + i + 1] = nums[k];
            }
            len = len - j + i + 1;
        }
        return len;
    }
}
