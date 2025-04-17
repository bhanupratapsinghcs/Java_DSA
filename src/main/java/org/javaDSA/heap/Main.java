package org.javaDSA.heap;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(15);

        System.out.println("Heap elements: " + heap.getHeap());

        heap.insert(35);
        System.out.println("Heap after inserting 35: " + heap.getHeap());
        heap.insert(25);
        heap.insert(25);
        System.out.println("Heap after inserting 25: " + heap.getHeap());

        heap.removeMax();
        System.out.println("Heap after removing max: " + heap.getHeap());
        heap.removeMax();
        heap.removeMax();
        heap.removeMax();
        System.out.println("Heap after removing max: " + heap.getHeap());
    }
}
