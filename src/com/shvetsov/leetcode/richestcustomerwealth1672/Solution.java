package com.shvetsov.leetcode.richestcustomerwealth1672;

public class Solution {

//Runtime: 1 ms, faster than 57.71%
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentSum += accounts[i][j];
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
