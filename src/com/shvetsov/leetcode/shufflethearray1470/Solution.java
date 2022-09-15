package com.shvetsov.leetcode.shufflethearray1470;

//Runtime: 0 ms, faster than 100.00%
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int leftPartStartIndex = 0;
        int rightPartStartIndex = n;

        for (int i = 0; i < result.length; i += 2) {
            result[i] = nums[leftPartStartIndex];
            leftPartStartIndex++;
        }

        for (int i = 1; i <= result.length; i += 2) {
            result[i] = nums[rightPartStartIndex];
            rightPartStartIndex++;
        }

        return result;
    }
}

/*
1. [x1,x2,x3,y1,y2,y3]->[x1,y1,x2,y2,x3,y3], n = 3 - half of array(pointer)
2. mentally divide the array into two parts before and after the pointer
3. [x1,x2,x3] [pointer -> (y1),y2,y3]
4. create an empty array with nums.length [0, 0, 0, 0, 0, 0]
5. put elements form nums[leftPartStartIndex] to all even positions of result[] and increase leftPartStartIndex to 1
6. put elements form nums[rightPartStartIndex] to all odd positions of result[] and increase rightPartStartIndex to 1
7. this is because all X are on the left part and should take all even positions in result[] and all Y should take odd
*/
