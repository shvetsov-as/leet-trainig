package com.shvetsov.leetcode.runningSumOf1dArray1480;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    Solution2 solution2;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
    }

    @Test
    void shouldReturnFibSum() {
        assertThat(solution.runningSum(new int[]{1,2,3,4})).containsExactly(1,3,6,10);
        assertThat(solution.runningSum(new int[]{1,1,1,1,1})).containsExactly(1,2,3,4,5);
        assertThat(solution.runningSum(new int[]{3,1,2,10,1})).containsExactly(3,4,6,16,17);
    }

    @Test
    void shouldReturnFibSum2() {
        assertThat(solution2.runningSum(new int[]{1,2,3,4})).containsExactly(1,3,6,10);
        assertThat(solution2.runningSum(new int[]{1,1,1,1,1})).containsExactly(1,2,3,4,5);
        assertThat(solution2.runningSum(new int[]{3,1,2,10,1})).containsExactly(3,4,6,16,17);
    }
}