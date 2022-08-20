package com.shvetsov.leetcode.jewelsandstones771;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Runtime: 34 ms
class Solution {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        String[] jew = new String[jewels.length()];

        for (int i = 0; i < jewels.length(); i++) {
            jew[i] = String.valueOf(jewels.charAt(i));

        }

        for (int i = 0; i < jew.length; i++) {

            Pattern pattern = Pattern.compile("(\\w|^)" + jew[i] + "(\\w|$)");
            Matcher matcher = pattern.matcher(stones);

            if (matcher.find()) {
                count++;
                stones = stones.replaceFirst(jew[i], "");
                i--;
            }
        }
        return count;

    }
}
