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
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    // Remove a node from the end of the linked list
    public Node removeLast(){
        if(head == null){
            return null;
        }
        Node current = head;
        Node previous = null;
        while(current != tail){
            previous = current;
            current = current.next;
        }
        if(previous != null){
            previous.next = null;
            tail = previous;
            length--;
        }else{
            head = null;
            tail = null;
            length = 0;
        }
        return current;
    }

    // Add a new node at the beginning of the linked list
    public void prepend(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    // Remove a node from the beginning of the linked list
    public Node removeFirst(){
        if(head == null){
            return null;
        }
        Node removedNode = head;
        head = head.next;
        length--;
        return removedNode;
    }

    // Get a node at a specific index
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node current = head;
        int count = 0;
        while(count < index) {
            current = current.next;
            count++;
        }
        return current;
    }

    // set a node at a specific index
    public void set(int index, int data){
        Node current = get(index);
        if(current != null){
            current.data = data;
        }
        if(current == null)
            System.out.println("Index out of bound");
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
