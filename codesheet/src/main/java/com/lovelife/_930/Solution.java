package com.lovelife._930;

class Solution {

    public int numSubarraysWithSum(int[] A, int S) {
        if (S > A.length) {
            return 0;
        }
        int res = 0;
        int sum = 0;
        for (int i = 0; i <= A.length - S;i++) {
            for (int j = i; j < A.length;) {
                if (i == j) {
                    sum = A[i];
                }
                if (sum < S) {
                    j++;
                    if (j < A.length) {
                        sum += A[j];
                    }
                    continue;
                }
                if (sum > S) {
                    break;
                }
                res++;
                j++;
                if (j < A.length) {
                    sum += A[j];
                }
            }

        }
        return res;
    }
}