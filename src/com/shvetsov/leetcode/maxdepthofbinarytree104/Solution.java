package com.shvetsov.leetcode.maxdepthofbinarytree104;

import com.shvetsov.leetcode.TreeNode;

//Runtime: 0 ms, faster than 100.00%
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

}


