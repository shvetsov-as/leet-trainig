package com.shvetsov.leetcode.jewelsandstones771;

// Runtime: 1 ms, faster than 98.04% of Java online submissions for Jewels and Stones.
// Memory Usage: 40.5 MB, less than 97.21% of Java online submissions for Jewels and Stones.
class Solution2 {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        char[] jew = jewels.toCharArray();
        char[] sto = stones.toCharArray();

        for (char jewel : jew) {
            for (char stone : sto) {
                if (jewel == stone) {
                    count++;
                }
            }
        }
        return count;
    }
}
