package com.shvetsov.leetcode.addtwoIntegers2235;

//Runtime: 1 ms, faster than 67.7%
class Solution {
    public int sum(int num1, int num2) {
        return Math.addExact(num1, num2);
    }
}

//Runtime: 1 ms, faster than 67.62%
class Solution2 {
    public int sum(int num1, int num2) {
        if(num2 == 0) return num1;
        int temp = (num1 & num2) << 1;
        return sum(num1 ^ num2,temp);
    }
}


