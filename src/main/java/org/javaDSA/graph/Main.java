package org.javaDSA.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("D", "F");

        System.out.println("Graph:");
        graph.printGraph();
        System.out.println("Removing edge B-D");
        graph.removeEdge("B", "D");
        System.out.println("Graph after removing edge B-D:");
        graph.printGraph();

        System.out.println("Removing vertex C");
        graph.removeVertex("C");
        System.out.println("Graph after removing vertex C:");
        graph.printGraph();
    }
}
