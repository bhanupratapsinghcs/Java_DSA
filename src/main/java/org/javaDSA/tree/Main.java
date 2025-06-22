package org.javaDSA.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(8);
        bst.insert(3);
        bst.insert(7);
        bst.insert(18);
        bst.insert(16);
        bst.insert(20);
        System.out.println(bst.bfs());
        System.out.println();
        bst.preOrder(bst.getRoot());
        System.out.println();
        bst.printInOrder(bst.getRoot());
        System.out.println();
        bst.postOrder(bst.getRoot());
        System.out.println();
        System.out.println(bst.search(10));
        System.out.println(bst.search(5));
        System.out.println(bst.search(15));
        System.out.println(bst.search(8));
        System.out.println(bst.search(3));
        System.out.println(bst.search(7));
        System.out.println(bst.search(18));
        System.out.println(bst.search(16));
        System.out.println(bst.search(20));
        System.out.println(bst.search(100));

        System.out.println(bst.search(0));
        System.out.println(bst.search(5));
        System.out.println(bst.search(15));
        bst.rInsert(5);
        bst.rInsert(10);
        bst.printInOrder(bst.getRoot());
        System.out.println();
        System.out.println(bst.findMin());
        bst.rDelete(10);
        bst.printInOrder(bst.getRoot());
    }
}
