package org.javaDSA.doublyLinkedList;

import org.javaDSA.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkList = new DoublyLinkedList();
        linkList.append(1);
        linkList.append(2);
        linkList.append(3);
        linkList.append(4);
        linkList.append(5);
        linkList.printLinkedList();
        linkList.prepend(6);
        linkList.prepend(7);
        linkList.prepend(8);
        linkList.prepend(9);
        linkList.insert(9, 55);
        linkList.insert(9, 43);
        linkList.printLinkedList();
//        linkList.reverse();
        linkList.printLinkedList();
        System.out.println("Head -> " + linkList.getHead().data);
        System.out.println("Tail -> " + linkList.getTail().data);
        System.out.println("-----");
        System.out.println(linkList.get(0).data);
        System.out.println(linkList.get(3).data);
        System.out.println(linkList.get(4).data);
        System.out.println(linkList.get(8).data);
        linkList.set(5, 0);
        linkList.set(9, 0);
        linkList.printLinkedList();
        System.out.println("Remove at index 0:");
        System.out.println(linkList.remove(0).data + " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeLast().data + " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeLast().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeLast().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeLast().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeLast().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeFirst().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeFirst().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeFirst().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeFirst()+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println("Head -> " + linkList.getHead());
        System.out.println("Tail -> " + linkList.getTail());
    }
}
