import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {

    // Adjacency List = An array/arraylist of linkedlists.
    //                  Each LinkedList has a unique node at the head.
    //                  All adjacent neighbors to that node are added to that nodes linkedlist

    public static void main(String[] args){

        graph graph = new graph();
        graph.addNode(new node('A'));
        graph.addNode(new node('B'));
        graph.addNode(new node('C'));
        graph.addNode(new node('D'));
        graph.addNode(new node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
    }
}

class node{
    char data;

    node(char data){
        this.data = data;
    }
}

class graph{

    ArrayList<LinkedList<node>> alist;

    graph(){
        alist = new ArrayList<>();
    }

    public void addNode(node node){
        LinkedList<node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<node> currentList = alist.get(src);
        node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<node> currentList = alist.get(src);
        node dstNode = alist.get(dst).get(0);

        for(node node : currentList){
            if(node == dstNode){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<node> currentList : alist){
            for(node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}