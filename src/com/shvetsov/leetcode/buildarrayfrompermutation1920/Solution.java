package com.shvetsov.leetcode.buildarrayfrompermutation1920;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Runtime: 12 ms, faster than 8.19%
class Solution {
    public int[] buildArray(int[] nums) {

        int[] newarr = new int[nums.length];
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        for (int i = 0; i < nums.length; i++) {
            newarr[i] = nums[list.get(i)];
        }
        return newarr;
    }
}
//Runtime: 17 ms, faster than 8.19%
class Solution2 {

    public int[] buildArray(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().toList();
        return IntStream.range(0, nums.length).map(i -> nums[list.get(i)]).toArray();
    }
}

//Runtime: 2 ms, faster than 48.95%
//r = a - [a / b] * b <=> a % b = r => 2 % 3 = 2 <=> 2 = 2 - [2 / 3] * 3 = 2 - 0 * 3 = 2
class Solution3 {

    public int[] buildArray(int[] nums) {

        int[] newarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newarr[i] = nums[nums[i]];
        }
        return newarr;
    }
}

//Runtime: 1 ms, faster than 99.98%
class Solution4 {

    public int[] buildArray(int[] nums) {
        int[] newarr = new int[nums.length];
        loop(nums, newarr, 0);
        return newarr;
    }

    public void loop(int[] nums, int[] newarr, int i) {
        if (i == nums.length) {
            return;
        }
        newarr[i] = nums[nums[i]];
        loop(nums, newarr, i + 1);
    }
}