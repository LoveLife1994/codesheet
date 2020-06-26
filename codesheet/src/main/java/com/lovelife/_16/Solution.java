package com.lovelife._16;

import java.util.*;


import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int j,k,sum;
        for(int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            while (j < k) {
                if (j > i+1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> cur = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(cur);
                    j++;
                    continue;
                }
                if(sum > 0) {
                    k--;
                    continue;
                }
                j++;
            }
        }
        return res;
    }
}

