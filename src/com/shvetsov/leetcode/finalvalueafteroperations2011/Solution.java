package com.shvetsov.leetcode.finalvalueafteroperations2011;

//Runtime: 1 ms, faster than 96.83%
class Solution {

    public int finalValueAfterOperations(String[] operations) {

        int count = 0;

        for (String s : operations) {
            if (s.equals("++X") || s.equals("X++")) {
                ++count;
            } else {
                --count;
            }
        }
        return count;
    }
}

//Runtime: 2 ms, faster than 47.54%
class Solution2 {

    public int finalValueAfterOperations(String[] operations) {

        int count = 0;
        int x = 0;

        loop(operations, x, count);

        return Integer.parseInt(operations[operations.length - 1]);
    }

    public void loop(String[] operations, int x, int count) {
        if (count >= operations.length) {
            operations[count - 1] = String.valueOf(x);
            return;
        }

        if (operations[count].charAt(1) == '+') {
            ++x;
        } else {
            --x;
        }

        loop(operations, x, count + 1);
    }
}

//Runtime: 0 ms, faster than 100.00%
class Solution3 {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                ++result;
            }
        }
        return (2 * result) - operations.length;
    }
}


