package org.javaDSA.linklist;

public class LinkList {
    static class Node{
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

    // Add a new node at the end of the link list
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    // Display the link list
    public void printLinkList(){
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
