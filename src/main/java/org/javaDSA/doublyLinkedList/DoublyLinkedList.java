package org.javaDSA.doublyLinkedList;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
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

    // Print the linked list
    public void printLinkedList(){
        if(head == null){
            System.out.println("The linked list is empty.");
            return;
        }
        Node current = head;
        System.out.print("null ");
        while(current != null){
            System.out.print("<- " + current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Add a new node at the end of the linked list
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // Remove a node from the end of the linked list
    public Node removeLast(){
        if(head == null){
            return null;
        }
        Node current = tail;
        if(head == tail){
            head = null;
            tail = null;
            length--;
            return current;
        }
        tail = tail.prev;
        tail.next = null;
        current.prev = null;
        length--;
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
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;
        length++;
    }

    // Remove a node from the beginning of the linked list
    public Node removeFirst(){
        if(head == null){
            return null;
        }
        Node current = head;
        if(head == tail){
            head = null;
            tail = null;
            length--;
            return current;
        }
        head = head.next;
        head.prev = null;
        current.next = null;
        length--;
        return current;
    }

    // Get node at a specific index
    public Node get(int index){
        if(index < 0 || index >= length){
            System.out.println("The index is out of range.");
            return null;
        }
        Node current = head;
        int count = 0;
        while(count != index){
            current = current.next;
            count++;
        }
        return current;
    }

    // Set a node at a specific index
    public void set(int index, int data){
        Node current = get(index);
        if(current != null){
            current.data = data;
        }
        if (current == null){
            System.out.println("The index is out of range.");
        }
    }

    // Insert a node at a specific index
    public void insert(int index, int data){
        if(index < 0 || index > length){
            System.out.println("The index is out of range.");
        }
        if (index == 0){
            prepend(data);
            length++;
            return;
        }
        if (index == length){
            append(data);
            length++;
            return;
        }
        Node newNode = new Node(data);
        Node current = get(index - 1);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        length++;
    }

    // Remove a node at a specific index
    public Node remove(int index){
        if(index < 0 || index >= length){
            System.out.println("The index is out of range.");
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLast();
        }
        Node current = get(index - 1);
        Node removedNode = current.next;
        current.next = removedNode.next;
        removedNode.next.prev = current;
        removedNode.next = null;
        removedNode.prev = null;
        length--;
        return removedNode;
    }

}
