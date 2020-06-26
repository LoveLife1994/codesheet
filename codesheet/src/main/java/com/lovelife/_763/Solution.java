package com.lovelife._763;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String S) {
        int p1 = 0,p2 ,prev = 0;
        int tmp = 0;
        List<Integer> res = new ArrayList<>();
        if (S.length() == 0) {
            res.add(prev);
        }
        while (p1 < S.length()) {
            p2 = p1;
            while (p2 < S.length()) {
                if (S.charAt(p2) == S.charAt(p1)) {
                    tmp = Math.max(tmp, p2);
                }
                p2++;
            }
            if (p1 == tmp) {
                res.add(tmp + 1- prev);
                prev = tmp + 1;
            }
            p1++;
        }

        return res;
    }
}
