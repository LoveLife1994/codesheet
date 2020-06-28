package com.lovelife._986;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i=0,j=0;
        List<int[]> res = new ArrayList<>();
        if (A.length == 0 || B.length == 0) {
            return  res.toArray(new int[res.size()][2]);
        }
        while (i < A.length && j < B.length) {
            if (A[i][1] < B[j][0]) {
                i++;
                continue;
            }
            if (A[i][0] > B[j][1]) {
                j++;
                continue;
            }
            if (A[i][1] >= B[j][1]) {
                res.add(new int[]{Math.max(A[i][0], B[j][0]), B[j][1]});
                j++;
                continue;
            }
            if (A[i][1] < B[j][1]) {
                res.add(new int[]{Math.max(A[i][0], B[j][0]), A[i][1]});
                i++;
                continue;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
