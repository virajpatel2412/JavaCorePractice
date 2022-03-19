/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
public class SetInterfacedemo {
    public static void main(String args[]){
        Set<Integer> s = new HashSet<>();
//        Add function add the object if set does not contain that element 
//        and return true else return false
        s.add(2);
        System.out.println(s);
        System.out.println(s.contains(Integer.valueOf(2)));
        s.remove(2);
        System.out.println(s);
        
        HashSet<Integer> set = new LinkedHashSet<>();
   
    }
}
