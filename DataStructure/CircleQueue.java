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
public class CircleQueue<T> {
    private class Node{
        T data;
        Node next;
        
        Node(T data){
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return  data.toString();
        }
              
    }
    Node front;
    private Node rear;
    int length=0;
    
    public void Enqueue(T data){
        Node temp = new Node(data);
        if(this.front == null){
            this.front = temp;
            this.rear = temp;
        }else{
            this.rear.next = temp;
            this.rear = temp;
            temp.next = this.front;
        }
        this.length++;
    }
    
    public T Dequeue(){
        if(this.front == null){
            return null;
        }   
        Node temp = this.front;
        this.front = this.front.next;
        this.rear.next = this.front;
        this.length--;
        return temp.data;
    }
    
    public int size(){
        return this.length;
    }
    
    @Override
    public String toString() {
        if(this.length == 0){
            return null;
        }
        Node temp = this.front;
        StringBuilder sb = new StringBuilder();
        sb.append("Queue { ");
        do{
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }while(temp != this.rear);
        sb.append("}");
        return sb.toString();
    }

    
    public int find(T x){
        if(this.front == null){
            return -1;
        }
        int i=0;
        Node temp = this.front;
        while(temp != this.rear){
            if(x == temp.data){
                System.out.println(i);
                return i;
            }
            else{
                i++;
                temp = temp.next;
            }
        }
        if(this.rear.data == x)
            return i;
        return -1;
    }
}
