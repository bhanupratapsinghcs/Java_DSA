package org.javaDSA.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printQueue();
        System.out.println("-----");
        System.out.println("Length -> " + queue.getLength());
        System.out.println("-----");
        System.out.println("Dequeue -> " + queue.dequeue().data);
        System.out.println("Dequeue -> " + queue.dequeue().data);
        System.out.println("Dequeue -> " + queue.dequeue().data);
        System.out.println("Dequeue -> " + queue.dequeue().data);
        System.out.println("Dequeue -> " + queue.dequeue().data);
        queue.printQueue();
    }
}
