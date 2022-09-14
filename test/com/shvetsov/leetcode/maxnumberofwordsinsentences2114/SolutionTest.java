package com.shvetsov.leetcode.maxnumberofwordsinsentences2114;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    Solution2 solution2;
    String[] case1;
    String[] case2;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
        case1 = new String[]
                {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        case2 = new String[]
                {"please wait", "continue to fight", "continue to win"};
    }

    @Test
    void shouldReturnCountOfMaxWordsInString() {
        assertThat(solution.mostWordsFound(case1)).isEqualTo(6);
        assertThat(solution.mostWordsFound(case2)).isEqualTo(3);
    }

    @Test
    void shouldReturnCountOfMaxWordsInString2() {
        assertThat(solution2.mostWordsFound(case1)).isEqualTo(6);
    }

    @Test
    void shouldReturnCountOfMaxWordsInString3() {
        assertThat(solution2.mostWordsFound(case2)).isEqualTo(3);
    }
}