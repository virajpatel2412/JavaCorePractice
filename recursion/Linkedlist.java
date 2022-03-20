package recursion;

public class Linkedlist<T> {

	public Linkedlist() {
		this.head = null;
	}
	
	public class Node{
		Node next;
		T data;

		Node(T data){
			this.data = data;
			this.next = null;
		}
		
		@Override
		public String toString() {
			return  data + " ";
		}
	}
	
	public Node head=null;
	private int length=0;
	
	
	public Node recursiveAdd(Node head, T x) {
		if(head == null)
			return new Node(x);
		
		head.next = recursiveAdd(head.next, x);
		return head;
	}
	public void add(T x) {
		this.head = recursiveAdd(this.head, x);
		this.length++;
	}
	
	
	public void remove() {
		this.head = recursiveRemove(this.head);
	}
	public Node recursiveRemove(Node head) {
		if(head.next == null)
			return null;
		
		head.next = recursiveRemove(head.next);
		return head;
	}
	
	
	public void print() {
		recursivePrint(this.head);
		System.out.println();
	}
	private void recursivePrint(Node head) {
		if(head == null)
			return;
		System.out.print(head.data +" ");
		recursivePrint(head.next);
	}
	
    public void remove(int x) {
    	this.head = recursiveRemove(this.head, x);
    }
    private Node recursiveRemove(Node head, int x) {
    	if(x == 0)
    		return head.next;
    	if(x==1) {
    		head.next = head.next.next;
    		return head;
    	}
    	else {
    		head.next = recursiveRemove(head.next, x-1);
    	}
    	return head;
    }
}
