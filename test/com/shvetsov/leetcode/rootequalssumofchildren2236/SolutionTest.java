package com.shvetsov.leetcode.rootequalssumofchildren2236;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    Solution solution;
    Solution2 solution2;
    TreeNode testroot1;
    TreeNode testroot2;
    TreeNode testroot3;
    TreeNode testroot4;
    TreeNode testroot5;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        testroot1 = new TreeNode(10, new TreeNode(4), new TreeNode(6));
        testroot2 = new TreeNode(5, new TreeNode(3), new TreeNode(1));
        testroot3 = new TreeNode(0, new TreeNode(0), new TreeNode(0));
        testroot4 = new TreeNode(10, new TreeNode(0), new TreeNode(10));
        testroot5 = new TreeNode(0, new TreeNode(5), new TreeNode(10));
    }

    @Test
    void shouldReturnTrue() {
        assertThat(solution.checkTree(testroot1)).isTrue();
        assertThat(solution.checkTree(testroot3)).isTrue();
        assertThat(solution.checkTree(testroot4)).isTrue();
    }

    @Test
    void shouldReturnTrue2() {
        assertThat(solution2.checkTree(testroot1)).isTrue();
        assertThat(solution2.checkTree(testroot3)).isTrue();
        assertThat(solution2.checkTree(testroot4)).isTrue();
    }

    @Test
    void shouldReturnFalse() {
        assertThat(solution.checkTree(testroot2)).isFalse();
        assertThat(solution.checkTree(testroot5)).isFalse();
    }

    @Test
    void shouldReturnFalse2() {
        assertThat(solution2.checkTree(testroot2)).isFalse();
        assertThat(solution2.checkTree(testroot5)).isFalse();
    }
}