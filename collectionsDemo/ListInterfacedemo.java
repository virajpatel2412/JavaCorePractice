/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ListInterfacedemo {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();

//        If insertion operation sucefully done return true
        System.out.println(list.add(1));
        System.out.println(list);

//        Insert Element at specified index
        list.add(0, 2);
        System.out.println(list);

//        Insert given Collections object at the end of the list
        List<Integer> li = new LinkedList<>();
        li.add(3);
        list.addAll(li);
        System.out.println(list);

//        Insert given Collections objet at the specified index of the list
        list.addAll(1, list);
        System.out.println(list);

//        More usefull functions
        System.out.println(list.contains(2));
        System.out.println(list.containsAll(li));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(3));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(Integer.valueOf(3)));
        System.out.println(list);
        
        
//        Sort the list using Comparator 
        list.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return (a.compareTo(b));
            }
        });
        System.out.println("Sorted list Ascending Order : "+list);
        
        
        
//        Sort the list in reverse order using Comparator
        list.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return (b.compareTo(a));
            }
        });
        System.out.println("Sorted list Reverse Order : "+list);
        
//        list.clear();
        System.out.println("Clear list : "+list);
        
        
//        Convert List to Array
        Object[] arr = list.toArray();
        for(Object x: arr){
            System.out.println(x);
        }
    }
    
    
}
