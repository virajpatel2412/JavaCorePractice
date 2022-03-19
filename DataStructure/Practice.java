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
        
        CircleQueue<Integer> q = new CircleQueue<>();
        for(int i=0; i<10; i++){
            q.Enqueue(i*10);
        }
                System.out.println("hiii");

                for(int i=0; i<9; i++){
                    System.out.print(" "+q.front);
                    q.Dequeue();
                }
        System.out.println(q.find(90));
//        q.Dequeue();
//        q.Dequeue();
//        q.Dequeue();
//        q.Dequeue();
//        System.out.println(q.Dequeue());
//
//        System.out.println(q);
//        System.out.println(q.size());
    }  
}