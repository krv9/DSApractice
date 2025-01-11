package com.task2.Binarytree;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Lca {

   static Node findLca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.key == n1 || root.key == n2) {
            return root;
        }

        Node left = findLca(root.left, n1, n2);
        Node right = findLca(root.right, n1, n2);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
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

        int n1 = 20;
        int n2 = 80;
        Node lca = findLca(tree.root, n1, n2);

        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + lca.key);
        } else {
            System.out.println("Keys are not present in the tree.");
        }
    }
}
