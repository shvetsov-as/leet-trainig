package com.shvetsov.leetcode.concatenationofarray1929;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();

    }

    @Test
    void shouldReturnDoubleCopyOfArray() {

        assertThat(solution.getConcatenation(new int[]{1,2,1})).containsExactly(1,2,1,1,2,1);
        assertThat(solution.getConcatenation(new int[]{1,3,2,1})).containsExactly(1,3,2,1,1,3,2,1);
    }
}