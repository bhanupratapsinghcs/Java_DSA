package org.javaDSA.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        linkList.append(1);
        linkList.append(2);
        linkList.append(3);
        linkList.append(4);
        linkList.append(5);
        linkList.prepend(6);
        linkList.prepend(7);
        linkList.prepend(8);
        linkList.prepend(9);
        System.out.println(linkList.get(0).data);
        System.out.println(linkList.get(3).data);
        System.out.println(linkList.get(4).data);
        System.out.println(linkList.get(8).data);
        linkList.set(5, 0);
        linkList.set(9, 0);
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
        System.out.println(linkList.removeFirst().data+ " " + linkList.getLength());
        linkList.printLinkedList();
        System.out.println(linkList.removeFirst()+ " " + linkList.getLength());
        linkList.printLinkedList();
    }
}
