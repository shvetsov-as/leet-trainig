package com.shvetsov.leetcode.concatenationOfArray1929;

//Runtime: 1 ms, faster than 98.79%
public class Solution {

    public int[] getConcatenation(int[] nums) {

        int[] newarr = new int[nums.length * 2];
        int count = 0;
        int numsIndex = 0;

        loop(newarr, nums, count, numsIndex);

        return newarr;
    }

    public void loop(int[] result, int[] nums, int count, int numsIndex){

        if (count == result.length) {
            return;
        }

        if (numsIndex == nums.length) {
            numsIndex = 0;
        }

        result[count] = nums[numsIndex];

        loop(result, nums, count + 1, numsIndex + 1);
    }
}
