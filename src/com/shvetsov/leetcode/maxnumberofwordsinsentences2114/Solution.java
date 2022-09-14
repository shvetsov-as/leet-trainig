package com.shvetsov.leetcode.maxnumberofwordsinsentences2114;

import java.util.StringTokenizer;

//Runtime: 4 ms, faster than 82.25%
class Solution {
    public int mostWordsFound(String[] sentences) {
        int currentMax = 0;
        int max = 0;

        for (String s : sentences) {
            StringTokenizer tokenizer = new StringTokenizer(s, " ");
            currentMax = tokenizer.countTokens();

            if (max < currentMax) {
                max = currentMax;
            }
        }
        return max;
    }
}

//Runtime: 3 ms, faster than 96.52%

class Solution2 {
    int max = 0;
    int current = 0;
    int count = 0;

    public int mostWordsFound(String[] sentences) {
        loop(sentences, count);
        return max + 1;
    }

    private void loop(String[] sentences, int count) {
        if (count == sentences.length) {
            return;
        }
        wordCount(sentences[count]);
        if (max < current) {
            max = current;
        }
        current = 0;
        loop(sentences, count + 1);
    }

    private void wordCount(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                current++;
            }
        }
    }
}

//Runtime: 3 ms, faster than 96.52%
class Solution3 {
    public int mostWordsFound(String[] sentences) {
        int x = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            if (s.length > x) {
                x = s.length;
            }
        }
        return x;
    }
}

class Solution4 {

    public int mostWordsFound(String[] sentences) {
        int max = wordCounter(sentences[0]);
        for (int i = 1; i < sentences.length; i++) {
            if (wordCounter(sentences[i]) > max) {
                max = wordCounter(sentences[i]);
            }
        }
        return max;
    }

    public int wordCounter(String sentence) {
        int currentMax = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                currentMax++;
            }
        }
        return currentMax;
    }
}

