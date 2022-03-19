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
public class DoublyLinkedlist<Object> {

    private class Node {

        Object data;
        Node next;
        Node prev;

        Node() {
        }

        Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return data + ", ";
        }
    }
    private Node head;
    private Node last;
    private int length;

    public void insertAtFirst(Object data) {
        Node temp = new Node(data);
        if (this.head == null) {
            this.head = temp;
            this.last = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            this.head = temp;
        }
        this.length++;
    }

    public void insertAtLast(Object data) {
        Node temp = new Node(data);
        if (this.head == null) {
            this.head = temp;
            this.last = temp;
        } else {
            this.last.next = temp;
            temp.prev = this.last;
            this.last = temp;
        }
        this.length++;
    }

    public boolean insert(Object data, int index) {
        Node temp = new Node(data);
        if (index > this.length || index<0) {
            return false;
        } else if (index == 0) {
            temp.next = this.head;
            this.head.prev = temp;
            this.head = temp;
            this.length++;
            return true;
        } else if(index == this.length){
            this.last.next = temp;
            temp.prev = this.last;
            this.last = temp;
            this.length++;
            return true;
        }else{
            Node cur = this.head;
            for(int i=0; i<index-1; i++){
                cur = cur.next;
            }
            temp.next = cur.next;
            cur.next.prev = temp;
            cur.next = temp;
            temp.prev = cur;
            return true;
        }

    }
    
    public boolean deleteFirst(){
        if(this.head == null){
            return false;
        }
        else if(this.head == this.last){
            this.head = null;
            this.last = null;
            this.length--;
            return true;
        }
        else{
            this.head = this.head.next;
            this.head.prev  = null;
            this.length--;
            return true;
        }
    }
    
    public boolean deleteLast(){
        if(this.head == null){
            return false;
        }
        else if(this.head == this.last){
            this.head = null;
            this.last = null;
            this.length--;
            return true;
        }
        else{
            this.last = this.last.prev;
            this.last.next = null;
            this.length--;
            return true;
        }
    }
    
    public boolean delete(int index){
        if(this.length-1 < index){
            return false;
        }
        else if(index == 0){
            return this.deleteFirst();
        }
        else if(index == this.length-1){
            return this.deleteLast();
        }
        else{
            Node cur= this.head;
            for(int i=0; i<index; i++){
                cur = cur.next;
            }
            cur.next.prev = cur.prev;
            cur.prev.next = cur.next;
            this.length--;
            return true;
        }
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
