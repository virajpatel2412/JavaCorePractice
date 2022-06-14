/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.HashSet;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;


public class Graph {
    private Map<Integer, LinkedList<Integer>> map;
    private int nodeCount;
    public Graph() {
        this.map = new TreeMap<>();
        this.nodeCount = 0;
    }
    
    public boolean addNode(int node){
    	if(map.containsKey(node))
    		return false;
    	
    	this.nodeCount++;
        this.map.put(node, new LinkedList<>());
        return true;
    }
    
    public void addEdge(int source, int dest, boolean bidirection){
        if(!map.containsKey(source))
            addNode(source);
        if(!map.containsKey(dest))
            addNode(dest);
        if(!bidirection)
            map.get(source).add(dest);
        else{
            map.get(source).add(dest);
            map.get(dest).add(source);
        }
    }

    public boolean isPathExist(int source, int dest) {
    	if(!map.containsKey(source) || !map.containsKey(dest)) {
    		return false;
    	}

    	HashSet<Integer >visited = new HashSet<>();
  
    	return isPathExist(source, dest, visited);
    }
    
    private boolean isPathExist(int source, int dest, HashSet<Integer> visited) {
    	if(source == dest)
    		return true;
    	
    	visited.add(source);
    	for(Integer x : map.get(source)) {
    		if(!visited.contains(x))
    			if(isPathExist(x, dest, visited))
    				return true;
    	}
    	return false;
    }
    
    
    public void printPaths(int source, int dest) {
    	if(!map.containsKey(source) || !map.containsKey(dest)) {
    		return;
    	}
    	
    	HashSet<Integer> visited = new HashSet<>();
    	printPaths(source, dest, visited, "");
    	
    }
    
    private void printPaths(int source, int dest, HashSet<Integer> visited, String paths) {
    	
    	if(source == dest) {
    		System.out.println(paths);
    		return;
    	}
    	visited.add(source);
    	for(Integer x : map.get(source)) {
    		if(!visited.contains(x)) {
    			printPaths(x, dest, visited, paths+" "+source);
    		}
    	}
    	visited.remove(source);
    }
    
    public void printDFS(int source) {
    	HashSet<Integer> visited = new HashSet<>();
    	printDFS(source, visited);
    }
    
    private void printDFS(int source, HashSet<Integer> visited) {
    	visited.add(source);
    	System.out.print(source+" ");
    	
    	for(Integer x : map.get(source)) {
    		if(!visited.contains(x))
    			printDFS(x, visited);
    	}
    }
    
    public void printBFS(int source) {
    	HashSet<Integer> visited = new HashSet<>();
    	Queue<Integer> queue = new LinkedList<>();
    	
    	queue.add(source);
    	visited.add(source);
    	
    	while(!queue.isEmpty()) {
    		Integer temp = queue.remove();
    		System.out.print(temp+" ");
    		for(Integer nbr : map.get(temp)) {
    			if(!visited.contains(nbr)) {
    				visited.add(nbr);
    				queue.add(nbr);
    			}
    		}
    	}
    	
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<Integer, LinkedList<Integer>>> it = map.entrySet().iterator(); 
            
        while(it.hasNext()){
            Map.Entry<Integer,LinkedList<Integer>> entry = it.next();
            sb.append("\n").append(entry.getKey()).append(" : ").append(entry.getValue());
        }
        return sb.toString();
    }

	   
}
