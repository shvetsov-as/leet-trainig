package com.shvetsov.leetcode.findarrayfromdoubledarray2007;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    int[] case1;
    int[] case2;
    int[] case3;
    int[] case4;
    int[] case5;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        case1 = new int[]
                {1, 3, 4, 2, 6, 8};
        case2 = new int[]
                {6, 3, 0, 1};
        case3 = new int[]
                {1};
        case4 = new int[]
                {0, 0, 0, 0};
        case5 = new int[]
                {2, 1};
    }

    @Test
    void shouldReturnOriginalArray() {
        assertThat(solution.findOriginalArray(case1)).contains(1, 3, 4);
       // assertThat(solution.findOriginalArray(case2)).isEmpty();
        //assertThat(solution.findOriginalArray(case3)).isEmpty();
        //assertThat(solution.findOriginalArray(case4)).contains(0, 0);
       // assertThat(solution.findOriginalArray(case5)).contains(1);

    }
}