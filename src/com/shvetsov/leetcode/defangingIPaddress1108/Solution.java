package com.shvetsov.leetcode.defangingIPaddress1108;

// Runtime: 0 ms, faster than 100.00% Memory Usage: less than ~26.00%
class Solution {

    public String defangIPaddr(String address) {

        String[] addressArray = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        int count = 0;

        loop(addressArray, sb, count);

        return sb.toString();

    }

    public void loop(String[] addressArray, StringBuilder sb, int count) {

        if (count == addressArray.length) {
            return;
        }

        sb.append(addressArray[count]);
        if (count < addressArray.length - 1) {
            sb.append("[.]");
        }

        loop(addressArray, sb, count + 1);
    }
}

// Runtime: 0 ms, faster than 100.00% Memory Usage: 40.1 MB, less than 96.99%
class Solution2 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
