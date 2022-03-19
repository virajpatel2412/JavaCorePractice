/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author HP
 * @param <T>
 */
public class Queue<T> {

    private class Node {

        Node next;
        T data;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + '}';
        }

    }
    Node front, rear;
    int length = 0;

    public void Enqueue(T data) {
        Node temp = new Node(data);
        if (this.front == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.next = temp;
            this.rear = temp;
        }
        this.length++;

    }

    public T Dequeue() {
        Node temp;
        if (this.front == null) {
            return null;
        } else {
            temp = this.front;
            this.front = this.front.next;
            this.length--;
            return temp.data;
        }
    }

    @Override
    public String toString() {
        Node temp = this.front;
        StringBuilder sb = new StringBuilder();
        sb.append("Queue { ");
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        sb.append("}");
        return sb.toString();
    }

    public int size() {
        return this.length;
    }
}
