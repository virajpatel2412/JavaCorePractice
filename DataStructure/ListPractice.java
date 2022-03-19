/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ListPractice { 
    public static void main(String args[]){
        
//        *****     ArrayList Practice     *****
       
//        List<Integer> li = new ArrayList<Integer>();
//        List<Integer> l2 = new LinkedList<Integer>();
//        li.add(1);
//        li.add(2);
//        li.add(3);
//        l2.add(23);
//        l2.add(33);
//        li.addAll(l2);
//        System.out.println(li);
//        
//        li.remove(Integer.valueOf(23));
//        li.remove(0);
//        System.out.println(li);
//        
//        System.out.print(li.contains(2));
//        for(int x : li){
//           System.out.println(x);
//        }
//        
//        Iterator<Integer> it = li.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        
//        li.clear();
//        li.set(0,124);
//        li.get(2);
//        System.out.println(li);
        
        
        
        
//        ****   LinkedList Practice   ****
        
        List<Student> std = new LinkedList<>();
        Student std1 = new Student("Viraj", 1);
        Student std2 = new Student("Mitesh", 2);
        
        System.out.println(std2.compareTo(std1));
        std.add(std2);
        std.add(std1);
        std.add(new Student("Harsh", 66));
        std.add(new Student("Miraj", 4));
        
//        Sort the Student list in reverseOrder based on en nomber
        Collections.sort(std);
//        
//        Collections.sort(std, new Comparator<Student>(){ 
//            @Override
//            public int compare(Student s1, Student s2){
//                return s1.getname().compareTo(s2.getname());
//            }
//        });
        
        System.out.println(std);
    }
}
