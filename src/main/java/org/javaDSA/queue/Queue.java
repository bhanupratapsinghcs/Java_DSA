package org.javaDSA.queue;

public class Queue {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front = null;
    private Node rear = null;
    private int length = 0;
    public Node getFront() {
        return front;
    }
    public Node getRear() {
        return rear;
    }
    public int getLength() {
        return length;
    }
    public void printQueue(){
        if(front == null){
            System.out.println("The queue is empty.");
            return;
        }
        Node current = front;
        while(current != null){
            System.out.println("| " + current.data + " |");
            current = current.next;
        }
    }

    // Add a new node at the end of the queue
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    // Remove front node from the queue
    public Node dequeue(){
        if(front == null) return null;
        Node current = front;
        if(front == rear){
            rear = null;
            front = null;
        }else{
            front = front.next;
            current.next = null;
        }
        length--;
        return current;
    }
}
