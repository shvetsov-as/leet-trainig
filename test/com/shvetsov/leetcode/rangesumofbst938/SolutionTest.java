package com.shvetsov.leetcode.rangesumofbst938;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    TreeNode treeNode1;
    TreeNode treeNode2;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        treeNode1 = new TreeNode(10,
                        new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, new TreeNode(), new TreeNode(18)));
        treeNode2 = new TreeNode(10,
                        new TreeNode(5,
                            new TreeNode(3, new TreeNode(1), new TreeNode()),
                            new TreeNode(7, new TreeNode(6), new TreeNode())),
                        new TreeNode(15, new TreeNode(13), new TreeNode(18)));
    }

    @Test
    void shouldReturnSumInGivenRange() {
        assertThat(solution.rangeSumBST(treeNode1, 7, 15)).isEqualTo(32);
        assertThat(solution.rangeSumBST(treeNode2, 6, 10)).isEqualTo(23);
    }
}