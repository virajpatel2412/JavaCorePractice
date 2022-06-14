/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author HP
 */

public class Practice {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Graph g = new Graph();
        
        g.addNode(0);
        g.addNode(1);
        g.addNode(2);
        g.addNode(3);
        g.addNode(4);
        g.addNode(5);
        g.addNode(6);
        
        g.addEdge(0, 1, false);
        g.addEdge(0, 4, false);
        g.addEdge(1, 2, false);
        g.addEdge(2, 3, false);
        g.addEdge(3, 4, false);
        g.addEdge(4, 5, true);
        g.addEdge(5, 6, false);
        g.addEdge(4, 6, false);
//        g.printPaths(4, 6);
//        System.out.println(g.isPathExist(4, 5));
        g.printBFS(0);
        System.out.println(g);
    }  
}