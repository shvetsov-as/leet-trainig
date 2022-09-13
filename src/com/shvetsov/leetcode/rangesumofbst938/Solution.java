package com.shvetsov.leetcode.rangesumofbst938;

import com.shvetsov.leetcode.TreeNode;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

//Runtime: 36 ms, faster than 5.00%
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return sum;
    }
}

//Runtime: 0 ms, faster than 100.00%
class Solution2 {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        loop(root, low, high);
        return sum;
    }

    public void loop(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        if (root.val < low) {
            loop(root.right, low, high);
        } else if (root.val > high) {
            loop(root.left, low, high);
        } else {
            sum += root.val;
            loop(root.left, low, high);
            loop(root.right, low, high);
        }
    }
}

