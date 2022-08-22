package com.shvetsov.leetcode.defangingIPaddress1108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;
    Solution2 solution2;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
    }

    @Test
    void shouldDefangIPaddr() {

        assertThat(solution.defangIPaddr("1.1.1.1")).isEqualTo("1[.]1[.]1[.]1");
        assertThat(solution.defangIPaddr("255.100.50.0")).isEqualTo("255[.]100[.]50[.]0");
    }

    @Test
    void shouldDefangIPaddr2() {

        assertThat(solution2.defangIPaddr("1.1.1.1")).isEqualTo("1[.]1[.]1[.]1");
        assertThat(solution2.defangIPaddr("255.100.50.0")).isEqualTo("255[.]100[.]50[.]0");
    }
}