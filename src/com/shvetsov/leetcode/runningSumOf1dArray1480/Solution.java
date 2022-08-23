package com.shvetsov.leetcode.runningSumOf1dArray1480;

//Runtime: 0 ms, faster than 100.00%
class Solution {
    public int[] runningSum(int[] nums) {

        int count = 1;
        loop(nums, count);

        return nums;
    }

    public void loop(int[] nums, int count){
        if(count == nums.length){
            return;
        }

        nums[count] = nums[count - 1] + nums [count];

        loop(nums, count + 1);
    }
}

//Runtime: 0 ms, faster than 100.00%
class Solution2 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

}
