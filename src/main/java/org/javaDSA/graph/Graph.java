package org.javaDSA.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

    public void printGraph() {
        for (String vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (String neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Add a vertex to the graph
    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge between two vertices
    public void addEdge(String vertex1, String vertex2) {
        adjacencyList.putIfAbsent(vertex1, new ArrayList<>());
        adjacencyList.putIfAbsent(vertex2, new ArrayList<>());
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    // Remove an edge between two vertices
    public void removeEdge(String vertex1, String vertex2){
        ArrayList<String> vertex1Neighbors = adjacencyList.get(vertex1);
        ArrayList<String> vertex2Neighbors = adjacencyList.get(vertex2);
        if (vertex1Neighbors != null) {
            vertex1Neighbors.remove(vertex2);
        }
        if (vertex2Neighbors != null) {
            vertex2Neighbors.remove(vertex1);
        }
    }

    // Remove a vertex from the graph
    public void removeVertex(String vertex){
        if(!adjacencyList.containsKey(vertex)){
            return;
        }
        adjacencyList.remove(vertex);
        for(String otherVertex: adjacencyList.keySet()){
            adjacencyList.get(otherVertex).remove(vertex);
        }
    }
}
