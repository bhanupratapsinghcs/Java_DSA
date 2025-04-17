package org.javaDSA.hashTable;

import java.util.ArrayList;

public class HashTable {
    public static class Node{
        private String key;
        private int value;
        Node next;
        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private final int size = 10;
    private final Node[] table;

    public HashTable(){
        table = new Node[size];
    }

    public void printTable(){
        for(int i = 0; i < size; i++){
            System.out.print("Index " + i + ": ");
            Node temp = table[i];
            while(temp != null){
                System.out.print("(Key: " + temp.key + ", Value: " + temp.value + ")");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private int hash(String key){
        int hash = 0;
        for(int i = 0; i < key.length(); i++){
            hash = (hash + key.charAt(i)) % size;
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(table[index] == null){
            table[index] = newNode;
        }else{
            Node current = table[index];
            while(current != null){
                if(current.key.equals(key)){
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node current = table[index];
        while(current != null){
            if(current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        return -1; // Key not found
    }

    public ArrayList keys(){
        ArrayList<String> keys = new ArrayList<>();
        for(int i = 0; i < size; i++){
            Node current = table[i];
            while (current != null) {
                keys.add(current.key);
                current = current.next;
            }
        }
        return keys;
    }

}
