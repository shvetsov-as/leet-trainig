package com.shvetsov.leetcode.maxdepthofbinarytree104;

import com.shvetsov.leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;
    TreeNode treeNode1;
    TreeNode treeNode2;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        treeNode1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        treeNode2 = new TreeNode(1,null, new TreeNode(2));
    }

    @Test
    void shouldReturnMaxDepthOfTree() {
        assertThat(solution.maxDepth(treeNode1)).isEqualTo(3);
        assertThat(solution.maxDepth(treeNode2)).isEqualTo(2);
    }
}