package com.suse.codingtest.hackerrank;

/**
 * Program to count leaf nodes in a binary tree
 * A node is a leaf node if both left and right child nodes of it are NULL.
 *
 * Here is an algorithm to get the leaf node count.
 * getLeafCount(node)
 * 1) If node is NULL then return 0.
 * 2) Else If left and right child nodes are NULL return 1.
 * 3) Else recursively calculate leaf count of the tree using below formula.
 *     Leaf count of a tree = Leaf count of left subtree +
 *                                  Leaf count of right subtree
 */
public class BinaryTreeLeafNode {

    Node root;

    public static void main(String[] args) {
        BinaryTreeLeafNode binaryTree = new BinaryTreeLeafNode();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right = new Node(3);
        System.out.println(binaryTree.getLeafCount());
    }

    private int getLeafCount() {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return getLeafCount(root.left) + getLeafCount(root.right);
        }

    }

    private int getLeafCount(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return getLeafCount(node.left) + getLeafCount(node.right);
        }

    }
}

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
