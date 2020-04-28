package com.suse.codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {
        List<Integer> lengths = new ArrayList<>();

        // If the root.left = null traverse root.right && vice versa
        // if the root.left.left

        return 0;
    }

    private static int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1+ Math.max(height(node.left), height(node.right));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
