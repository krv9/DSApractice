package com.task2.Binarytree;

public class Bst {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        public void insert(int key) {
            root = insertRec(root, key);
        }

        private Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.key) {
                root.left = insertRec(root.left, key);
            } else if (key > root.key) {
                root.right = insertRec(root.right, key);
            }

            return root;
        }

        public void inorderTraversal(Node node) {
            if (node == null) {
                return;
            }

            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }

        public boolean isValid(Node root) {
            return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean isValid(Node root, long minVal, long maxVal) {
            if (root == null) {
                return true;
            }

            if (root.key <= minVal || root.key >= maxVal) {
                return false;
            }

            return isValid(root.left, minVal, root.key) && isValid(root.right, root.key, maxVal);
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            System.out.print("Inorder Traversal: ");
            tree.inorderTraversal(tree.root);
            System.out.println();

            System.out.println("Is valid BST: " + tree.isValid(tree.root));
        }
    }
}
