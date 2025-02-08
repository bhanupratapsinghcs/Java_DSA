package org.javaDSA.stack;

public class Stack {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top = null;
    private int height = 0;

    public Node getTop() {
        return top;
    }
    public int getHeight() {
        return height;
    }

    public void printStack(){
        if(top == null){
            System.out.println("The stack is empty.");
            return;
        }
        Node current = top;
        while(current != null){
            System.out.println("| " + current.data + " |");
            current = current.next;
        }
    }

    // Add a new node at the top of the stack
    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // Remove top node from the stack
    public Node pop(){
        if(top == null){
            return null;
        }
        Node current = top;
        top = top.next;
        height--;
        return current;
    }
}
