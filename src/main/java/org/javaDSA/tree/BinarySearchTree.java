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

    private Boolean rContain(Node node, int data){
        if(node == null){
            return false;
        }
        if(node.data == data){
            return true;
        }
        if(data < node.data){
            return rContain(node.left, data);
        }else {
            return rContain(node.right, data);
        }
    }

    public Boolean rContain(int data){
        return rContain(root, data);
    }

//    public void rInsert(Node node, int data){
//        if(node == null){
//            node = new Node(data);
//            return;
//        }
//        if(data < node.data){
//            if(node.left == null){
//                node.left = new Node(data);
//            }else{
//                rInsert(node.left, data);
//            }
//        }
//        else if(data > node.data){
//            if(node.right == null){
//                node.right = new Node(data);
//            }else{
//                rInsert(node.right, data);
//            }
//        }
//    }

    private Node rInsert(Node node, int data){
        if(node == null){
            return new Node(data);
        }
        if(data < node.data){
            node.left = rInsert(node.left, data);
        }else if(data > node.data){
            node.right = rInsert(node.right, data);
        }
        return node;
    }

    public void rInsert(int data){
        if(root == null){
            root = new Node(data);
        }
        rInsert(root, data);
    }

    private int findMin(Node node){
        if(node.left == null){
            return node.data;
        }
        return findMin(node.left);
    }

    public int findMin(){
        return findMin(root);
    }

    private Node rDelete(Node node, int data){
        if(node == null){
            return null;
        }
        if(data < node.data){
            node.left = rDelete(node.left, data);
        } else if(data > node.data){
            node.right = rDelete(node.right, data);
        } else {
            // Node to be deleted found
            if(node.left == null && node.right == null){
                return null; // Leaf node
            } else if(node.left == null){
                return node.right; // Node with only right child
            } else if(node.right == null){
                return node.left; // Node with only left child
            } else {
                // Node with two children, find the inorder successor (smallest in the right subtree)
                int minValue = findMin(node.right);
                node.data = minValue; // Replace with inorder successor
                node.right = rDelete(node.right, minValue); // Delete the inorder successor
            }
        }
        return node;
    }

    public void rDelete(int data){
        root = rDelete(root, data);
    }
}
