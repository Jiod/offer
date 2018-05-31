package com.fishpan.offer.tree;

public class TreeNode {
    private String data;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
