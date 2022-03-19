/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsDemo;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author HP
 */
public class QueueInterfacedemo {
    public static void main(String args[]){
//        Priority Queue is used to implement the min heap data structure
        Queue<Integer> q = new PriorityQueue<>();

        
//      Add function will return true if aobject add to queue sucessfully otherwise
//      throw an Exception so we must have to handle the exception
        try{
            System.out.println(q.add(1));
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(q);
        
        
//      Offer function will not throw an Exception if the insertion fail
        q.offer(2);
        System.out.println(q);

//        Return(not delete) the head of the queue if not null otherwise return null
        int a = q.peek();
        System.out.println(q);

//        Return and delete the head of the queue if not null otherwise return null
//        and does not throw the exception 
        int b = q.poll();
        System.out.println(q);
        
//        return and delete with exception
        int c = q.remove();
        System.out.println(q);
        
        q.offer(4);
        q.offer(2);
        q.offer(11);
        q.offer(7);
        System.out.println("Min heap : "+q);
        
        
//        Priority Queue as max heap
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        max.offer(5);
        max.offer(12);
        max.offer(1);
        max.offer(3);
        System.out.println("Max heap : "+max);
        
        
//        Remove perticular object of queue
        max.remove(Integer.valueOf(5));
        System.out.println(max);
        
        
//        Deque provide the methods like addFirst, addLast,
//        offerFirst, offerLast, removeFirst, removeLast, pollFirst, pollLast
//        getFirst, getLast, peekFirst, peekLast
        System.out.println("Dequeue methods demo : ");
        Deque<Integer> n = new ArrayDeque<>();
        n.offer(5);
        n.addFirst(4);
        n.addLast(6);
        System.out.println(n);
        
//        * With Exception method  ----   add, element(retrive not delete), remove
//        * 
//        * without Exception method ---- offer, peek, poll
    }    
}
