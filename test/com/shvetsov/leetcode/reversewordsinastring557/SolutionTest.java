package com.shvetsov.leetcode.reversewordsinastring557;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    Solution2 solution2;
    String testString1;
    String testString2;


    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
        testString1 = "Let's take LeetCode contest";
        testString2 = "God Ding";
    }

    @Test
    void shouldReverseWords() {
        assertThat(solution.reverseWords(testString1)).isEqualTo("s'teL ekat edoCteeL tsetnoc");
        assertThat(solution.reverseWords(testString2)).isEqualTo("doG gniD");
    }

    @Test
    void shouldReverseWords2() {
        assertThat(solution2.reverseWords(testString1)).isEqualTo("s'teL ekat edoCteeL tsetnoc");
        assertThat(solution2.reverseWords(testString2)).isEqualTo("doG gniD");
    }

}