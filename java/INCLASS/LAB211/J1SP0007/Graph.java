/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0007;

import java.util.Scanner;

class graphclass {

    private int Adjacencymatrix[][];
    private int size;

    public graphclass(int size) {
        this.size = size;
        Adjacencymatrix = new int[size][size];
    }

    public int[][] getAdjacencymatrix() {
        return Adjacencymatrix;
    }

    public void setAdjacencymatrix(int[][] adjacencymatrix) {
        Adjacencymatrix = adjacencymatrix;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

public class Graph {

    private int Adjacencymatrix[][];
    private int size;

    public Graph(int size) {
        this.Adjacencymatrix = new int[size][size];
        this.size = size;
    }

    public void setEdge(int x, int y) {
        if (x >= 0 && x < size || y >= 0 && y < size) {
            Adjacencymatrix[x][y] = 1;
            Adjacencymatrix[y][x] = 1;
        }
    }

    public boolean isEdge(int start, int end) {
        if (start >= 0 && start < size || end >= 0 && end < size) {
            if (Adjacencymatrix[start][end] == 1 && Adjacencymatrix[end][start] == 1) {
                return true;
            }
        }
        return false;
    }

    // public void display() {
    // System.out.print(" | ");
    // for (int i = 0; i < size; i++)
    // System.out.print(i + " ");
    // System.out.println();
    // for (int i = 0; i < size + 2; i++)
    // System.out.print("--");
    // System.out.println();
    // for (int i = 0; i < Adjacencymatrix.length; i++) {
    // System.out.print(i + " | ");
    // for (int j = 0; j < Adjacencymatrix.length; j++) {
    // System.out.print((Adjacencymatrix[i][j] == 0 ? " " : "1") + " ");
    // }
    // System.out.println();
    // }
    // }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.setEdge(1, 4);
        graph.setEdge(2, 4);
        graph.setEdge(4, 5);
        graph.setEdge(5, 4);
        graph.setEdge(3, 5);

        System.out.println("Enter the start point: ");
        int start = checkinput();
        System.out.println("Enter the end point: ");
        int end = checkinput();

        if (graph.isEdge(start, end))
            System.out.println("This is an edge");
        else
            System.out.println("This is not an edge");
    }

    public static int checkinput() {
        int n = 0;
        try {
            n = sc.nextInt();
            if (n >= 0)
                return n;
        } catch (Exception e) {
            System.out.println("Please enter a number. ");
            System.out.print("Please try again: ");
            sc.nextLine();
            return checkinput();
        }

        System.out.print("Please enter a positive number.\nEnter again: ");

        return checkinput();
    }

}
