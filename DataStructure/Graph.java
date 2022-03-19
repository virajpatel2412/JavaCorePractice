/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;


public class Graph<T> {
    private Map<T, LinkedList<T>> map;

    public Graph() {
        this.map = new TreeMap<>();
    }
    
    public void addNode(T node){
        this.map.put(node, new LinkedList<>());
    }
    
    public void addEdge(T source, T dest, boolean bidirection){
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

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<T, LinkedList<T>>> it = map.entrySet().iterator(); 
            
        while(it.hasNext()){
            Map.Entry<T,LinkedList<T>> entry = it.next();
            sb.append("\n").append(entry.getKey()).append(" : ").append(entry.getValue());
        }
        return sb.toString();
    }    
}
