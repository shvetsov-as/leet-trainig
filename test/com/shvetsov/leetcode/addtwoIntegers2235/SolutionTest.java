package com.shvetsov.leetcode.addtwoIntegers2235;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void shouldReturnSumOfTwoInts() {
        assertThat(solution.sum(1,3)).isEqualTo(4);
        assertThat(solution.sum(-2,2)).isEqualTo(0);
        assertThat(solution.sum(-2,4)).isEqualTo(2);
        assertThat(solution.sum(-2,-2)).isEqualTo(-4);
    }
}