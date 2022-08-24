package com.shvetsov.leetcode.buildarrayfrompermutation1920;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;
    Solution2 solution2;
    Solution3 solution3;
    Solution4 solution4;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
        solution3 = new Solution3();
        solution4 = new Solution4();
    }

    @Test
    void shouldReturnMutatedArray() {

        assertThat(solution.buildArray(new int[]{0,2,1,5,3,4})).containsExactly(0,1,2,4,5,3);
        assertThat(solution.buildArray(new int[]{5,0,1,2,3,4})).containsExactly(4,5,0,1,2,3);

    }

    @Test
    void shouldReturnMutatedArray2() {

        assertThat(solution2.buildArray(new int[]{0,2,1,5,3,4})).containsExactly(0,1,2,4,5,3);
        assertThat(solution2.buildArray(new int[]{5,0,1,2,3,4})).containsExactly(4,5,0,1,2,3);

    }

    @Test
    void shouldReturnMutatedArray3() {

        assertThat(solution3.buildArray(new int[]{0,2,1,5,3,4})).containsExactly(0,1,2,4,5,3);
        assertThat(solution3.buildArray(new int[]{5,0,1,2,3,4})).containsExactly(4,5,0,1,2,3);

    }

    @Test
    void shouldReturnMutatedArray4() {

        assertThat(solution4.buildArray(new int[]{0,2,1,5,3,4})).containsExactly(0,1,2,4,5,3);
        assertThat(solution4.buildArray(new int[]{5,0,1,2,3,4})).containsExactly(4,5,0,1,2,3);

    }
}