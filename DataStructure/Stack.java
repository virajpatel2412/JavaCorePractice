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
public class Stack<Object> {
    private Object data;
    private int length = 0;
    Linkedlist<Object> l = new Linkedlist<>();
    
    public void push(Object data){
        this.length++;
        l.insertAtLast(data);
    }
    
    public Object pop() throws Exception{
        this.length--;
        Object retval = l.get(this.length);
        l.removeLast();
        return retval;
    }
    
    public Object peek(int index){
          return l.get(index);
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int i=this.length-1; i>=0; i--){
            str+=this.peek(i)+"\n";
        }
        return str;
    }
}
