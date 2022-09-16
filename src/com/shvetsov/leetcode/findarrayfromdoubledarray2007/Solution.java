package com.shvetsov.leetcode.findarrayfromdoubledarray2007;

class Solution {
    /**
     * Algorithm
     * 1. If the length of changed is odd, return [] immediately. We need an even length
     * 2. Count the nums into an int[100_001];
     * 3. Quick check: if count[0] % 2 == 1, return [] immediadely. We can't have an odd nr of 0s
     * 4. For each count[], check if its double is < 100_000 and its count is >= 1.
     * If not, break immediately and return []
     * 5. If yes, then deduct 1 from the count of i and double i;
     * 6. Also, for each count, if the value is < 0, then we are missing that number, so return immediately[]
     */
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 == 1) {
            return new int[0];
        }
        int[] count = countNums(changed);
        return getOriginal(count, changed.length);
    }

    private int[] countNums(int[] changed) {
        int[] count = new int[100_001];
        for (int num : changed) {
            count[num]++;
        }
        return count;
    }

    private int[] getOriginal(int[] count, int total) {
        if (count[0] % 2 == 1) {
            return new int[0];
        }
        int[] original = new int[total / 2];
        int doubled, originalIndex = 0;
        for (int i = 0; i < count.length && total > 0; ) {
            if (count[i] < 0) {
                return new int[0];
            } else if (count[i] == 0) {
                i++;
            } else {
                doubled = i * 2;
                if (doubled >= count.length || count[doubled] <= 0) {
                    return new int[0];
                } else {
                    count[i]--;
                    count[doubled]--;
                    original[originalIndex++] = i;
                    total -= 2;
                }
            }
        }
        return original;
    }
}

