package com.fishpan.offer.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树遍历
 */
public class TraverseTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("1");

        TreeNode node2 = new TreeNode("2");
        TreeNode node3 = new TreeNode("3");

        root.setLeft(node2);
        root.setRight(node3);

        TreeNode node4 = new TreeNode("4");
        TreeNode node5 = new TreeNode("5");
        node2.setLeft(node4);
        node2.setRight(node5);

        traverse(root);
        layerTraverse(root);
    }

    /**
     * 二叉树的前序，中序，后序遍历
     * @param root 二叉树的根
     */
    private static void traverse(TreeNode root) {
        if (root != null) {
            // 通过改变root.getData()就可以实现前中后序访问
            System.out.println(root.getData());
            traverse(root.getLeft());
            traverse(root.getRight());
        }
    }

    /**
     * 二叉树的层序遍历
     * @param root
     */
    private static void layerTraverse(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                root = queue.poll();
                System.out.println(root.getData());
                if(root.getLeft() != null) {
                    queue.offer(root.getLeft());
                }

                if(root.getRight() != null) {
                    queue.offer(root.getRight());
                }
            }
        }
    }
}
