package org.javaDSA.hashTable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("name", 1);
        hashTable.set("age", 2);
        hashTable.set("address", 3);
        hashTable.set("phone", 4);
        hashTable.set("email", 5);
        hashTable.set("name", 6); // Update value for existing key
        hashTable.printTable();
        System.out.println("Value for 'name': " + hashTable.get("name"));
        System.out.println("Value for 'age': " + hashTable.get("age"));
        System.out.println("Value for 'address': " + hashTable.get("address1"));
        System.out.println(hashTable.keys());
    }
}
