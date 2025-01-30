package org.javaDSA.linkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    private Node tail = null;
    private int length = 0;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Add a new node at the end of the linked list
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    // Display the linked list
    public void printLinkedList(){
        Node current = head;
        if(head == null){
            System.out.println("LinkList is empty");
            return;
        }
        System.out.println("Nodes of LinkList are: ");
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

}
