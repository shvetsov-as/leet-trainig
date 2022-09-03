package com.shvetsov.leetcode.reversewordsinastring557;

// Runtime: 358 ms, faster than 6.99%
class Solution {
    public String reverseWords(String s) {
        String[] splitStr = new String[s.split(" ").length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitStr.length; i++) {
            splitStr[i] = s.split(" ")[i];

            sb.append(swap(splitStr[i]));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String swap(String s) {
        char[] chars = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        char temp;
        while (end > begin) {
            temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            end--;
            begin++;
        }
        return new String(chars);
    }
}

//Runtime: 4 ms, faster than 97.76%
class Solution2 {

    public String reverseWords(String s) {

        int beginIndex = 0;
        int endIndex = 0;

        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                endIndex = i - 1;
                swap(str, beginIndex, endIndex);
                beginIndex = i + 1;
            }
        }

        swap(str, beginIndex, s.length() - 1);

        return new String(str);
    }

    private void swap(char[] str, int startIndex, int endIndex) {

        char temp;
        while (startIndex <= endIndex) {
            temp = str[endIndex];
            str[endIndex] = str[startIndex];
            str[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}

