package org.javaDSA.tree;

public class BinarySearchTree {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    private Node root = null;

    public Node getRoot() {
        return root;
    }

    public boolean insert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return true;
        }
        Node current = root;
        while(true){
            if(data < current.data){
                if( current.left == null){
                    current.left = newNode;
                    return true;
                }
                current = current.left;
            } else if (data > current.data) {
                if (current.right == null){
                    current.right = newNode;
                    return true;
                }
                current = current.right;
            } else {
                return false;
            }
        }
    }

    public boolean search(int data){
        Node current = root;
        while (current != null) {
            if (data < current.data)
                current = current.left;
            else if (data > current.data)
                current = current.right;
            else return true;
        }
        return false;
    }

    public void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}
