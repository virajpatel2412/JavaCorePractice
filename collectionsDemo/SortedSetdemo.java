/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsDemo;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class SortedSetdemo {
    public static void main(String args[]){
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(2);
        
        set.remove(Integer.valueOf(2));
        System.out.println(set);
    }
}
