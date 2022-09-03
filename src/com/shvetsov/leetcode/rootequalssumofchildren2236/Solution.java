package com.shvetsov.leetcode.rootequalssumofchildren2236;

import java.util.Objects;

//Runtime: 1 ms, faster than 77.34%
class Solution {
    public boolean checkTree(TreeNode root) {
            return Objects.equals(root.val, root.left.val + root.right.val);
    }
}
// Runtime: 0 ms, faster than 100.00%
class Solution2 {
    public boolean checkTree(TreeNode root) {
        return (root.val == root.left.val + root.right.val) ? true : false;
    }
}

//Runtime: 1 ms, faster than 77.34%
class Solution3 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
