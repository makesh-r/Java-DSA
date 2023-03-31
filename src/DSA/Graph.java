package DSA;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph(int val) {
        for(int i = 0; i < val; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printAdjList() {
        for(int i=0; i<adjList.size(); i++) {
            System.out.println("Adj list of vertex " + i);
            ArrayList<Integer> temp = adjList.get(i);
            int size = temp.size();
            for(int j=0; j<size; j++) {
                System.out.println(" " +temp.get(j));
            }
        }
    }
}
