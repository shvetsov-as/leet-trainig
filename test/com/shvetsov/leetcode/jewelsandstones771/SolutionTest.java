package com.shvetsov.leetcode.jewelsandstones771;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void init(){
        solution = new Solution();

    }

    @Test
    void shouldCountNumJewelsInStones() {

        assertThat(solution.numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3);
        assertThat(solution.numJewelsInStones("z", "ZZ")).isEqualTo(0);
        assertThat(solution.numJewelsInStones("ebd", "bbb")).isEqualTo(3);
        assertThat(solution.numJewelsInStones("bcd", "cba")).isEqualTo(2);



    }





}