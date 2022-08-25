package com.shvetsov.leetcode.finalvalueafteroperations2011;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    Solution solution;
    Solution2 solution2;
    Solution3 solution3;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
        solution3 = new Solution3();
    }

    @Test
    void shouldReturnFinalValueAfterOperations() {
        assertThat(solution.finalValueAfterOperations(new String[]{"--X","X++","X++"})).isEqualTo(1);
        assertThat(solution.finalValueAfterOperations(new String[]{"++X","++X","X++"})).isEqualTo(3);
        assertThat(solution.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"})).isEqualTo(0);
    }

    @Test
    void shouldReturnFinalValueAfterOperations2() {
        assertThat(solution2.finalValueAfterOperations(new String[]{"--X","X++","X++"})).isEqualTo(1);
        assertThat(solution2.finalValueAfterOperations(new String[]{"++X","++X","X++"})).isEqualTo(3);
        assertThat(solution2.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"})).isEqualTo(0);
    }

    @Test
    void shouldReturnFinalValueAfterOperations3() {
        assertThat(solution3.finalValueAfterOperations(new String[]{"--X","X++","X++"})).isEqualTo(1);
        assertThat(solution3.finalValueAfterOperations(new String[]{"++X","++X","X++"})).isEqualTo(3);
        assertThat(solution3.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"})).isEqualTo(0);
    }
}