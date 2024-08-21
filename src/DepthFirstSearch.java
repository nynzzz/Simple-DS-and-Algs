import java.util.*;

public class DepthFirstSearch {

    // DFS = a search algorithm for traversing a tree or graph data structure
    //       Steps:  1.Pick a route
    //               2.Keep going until you reach a dead end, or a previous visited node
    //               3.Backtrack to last node that has unvisited adjacent neighbors

    public static void main(String[] args) {

        Graph1 graph = new Graph1(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        graph.depthFirstSearch(0);
    }
}

class Graph1 {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph1(int size){

        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node) {

        nodes.add(node);
    }
    public void addEdge(int src, int dst) {

        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst) {

        if(matrix[src][dst] == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public void print() {

        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }
    private void dFSHelper(int src, boolean[] visited) {

        if(visited[src]) {
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for(int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
        return;
    }
}
class Node1 {

    char data;

    Node1(char data){
        this.data = data;
    }
}