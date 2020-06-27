package com.lovelife._923;

import java.util.Arrays;

class Solution {
    public int threeSumMulti(int[] A, int target) {
        Arrays.sort(A);
        int i,j,k,l,r;
        int MOD = 1_000_000_007;
        long count = 0;
        for (i = 0; i < A.length; i++) {
            j = i+1;
            k = A.length - 1;
            while (j < k) {
                if (A[i] + A[j] + A[k] > target) {
                    k--;
                    continue;
                }
                if (A[i] + A[j] + A[k] < target) {
                    j++;
                    continue;
                }
                if (A[j] == A[k]) {
                    count += (k - j + 1) * (k - j) / 2;
                    count %= MOD;
                    break;
                } else {
                    l = r =1;
                    while (j+1 < k && A[j] == A[j+1]) {
                        l++;
                        j++;
                    }
                    while (k-1 > j && A[k] == A[k-1]) {
                        r++;
                        k--;
                    }
                    count += l*r;
                    count %= MOD;
                    j++;
                    k--;
                }
            }
        }
        return (int)count;
    }
}
