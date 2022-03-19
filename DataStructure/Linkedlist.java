/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

/**
 *
 * @author HP
 * @param <Object>  
 */
public class Linkedlist<Object> {

    public Linkedlist() {
        this.head = null;
    }
    
    private class Node{
        Object data;
        Node next = null;
        Node(){}
        Node(Object data){
            this.data = data;
        }

        @Override
        public String toString() {
            return data+", ";
        }   
    }
    
    public Node head;
    private Node last = null;
    private int length = 0;
    
    public void insertAtLast(Object data){
        Node temp = new Node(data);
        if(this.head == null){
            this.head = temp;
            this.last = temp;
        }
        else{
            last.next = temp;
            this.last = temp;
        }
        this.length++;
    }
    
    public void insertAtLast(Object[] arr, int x){
        for(int i=0; i<x; i++){
            insertAtLast(arr[i]);
        }
    }
    
    public void insertAtFirst(Object data){
        Node temp = new Node(data);
        if(head == null){
            this.head = temp;
        }
        else{
            temp.next = this.head;
            this.head = temp;
        }
        this.length++;
    }
    
    public void insertAtFirst(Object[] arr, int x){
        for(int i=x-1; i>=0; i--){
            insertAtFirst(arr[i]);
        }
    }
    
    public void insert(Object data, int x){
        Node cur = this.head;
        Node temp = new Node(data);
        if(x>=this.length){
            System.out.println("Enter valid index");
        }
        else{
            for(int i = 1; i<x; i++){
                cur = cur.next;
            }
            temp.next = cur.next;
            cur.next = temp;
        }
        this.length++;
    }
    
    public void insert(Object[] arr, int length, int index){
        Node cur = this.head;
        Node temp = null;
        if(index>this.length){
            System.out.println("Enter valid index");
        }
        else{
            for(int i = 1; i<index; i++){
                cur = cur.next;
            }
            for(int i=0; i<length; i++){
                temp = new Node(arr[i]);
                temp.next = cur.next;
                cur.next = temp;
                this.length++;
            }
            this.last = temp;
        }
    }
    
    public boolean removefirst(){
        if(this.head == null)
            return false;
        else{
            Node temp = this.head;
            this.head = this.head.next;
            this.length--;
            return true;
        }
    }
    
    public boolean removeLast(){
        if(this.last == null){
            return false;
        }
        else{
            Node temp = this.head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            this.length--;
            return true;
        }
    }
    
    public boolean remove(int index){
        if(this.length < index-1){
            return false;
        }
        else if(index == 0){
            this.head = this.head.next;
            return true;
        }
        else{
            Node temp = this.head;
            for(int i=1; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            this.length--;
            return true;
        }
    }
    
    public Object get(int index){
        Object temp = null;
        if(index<0 || index >= this.length){
           return null;
        }
        else if(index == 0){
            return this.head.data;
        }else if(index == this.length-1){
            return this.last.data;
        }
        else{
            Node cur = this.head;
            for(int i=0; i<index; i++){
                cur = cur.next;
            }
            temp = cur.data;
            return temp;
        }
    }
    
    public void printList(){
        Node temp = this.head;
        while(temp.next != null){ 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    
    public int size(){
        return this.length;
    }
    
    @Override
    public String toString(){
        String str = " ";
        if(this.head == null){
            return null;
        }
        else{
            str+= "[";
            Node temp = this.head;
            while(temp != null){
                str+= temp;
                temp=temp.next;
            }
            str+="]";
            return str;
        }
    }   
}