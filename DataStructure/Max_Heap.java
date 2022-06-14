package DataStructure;

import java.util.ArrayList;

public class Max_Heap {

	public ArrayList<Integer> Heap = new ArrayList<>();
	private int leftChild(int index) {
		return (2*index)+1;
	}
	private int rightChild(int index) {
		return (2*index)+2;
	}
	private int parent(double index) {
		return (int)(Math.ceil(index/2)-1);
	}
	
	private void heapify(int i) {
		int left = leftChild(i);
		int right = rightChild(i);
		int largest = i;

		if(this.Heap.size() > left &&  Heap.get(left) > Heap.get(largest)) {
			largest = left;
		}
		if(this.Heap.size() > right &&  Heap.get(right) > Heap.get(largest)) {
			largest = right;
		}
		if(i != largest) {
			int temp = Heap.get(i);
			Heap.set(i, Heap.get(largest));
			Heap.set(largest, temp);
			heapify(largest);
		}
	}
	
	public void createHeap(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			this.Heap.add(arr[i]);
		}
		int lastind = arr.length - 1;
		for(int i=parent(lastind); i>=0; i--) {
			heapify(i);
		}
	}
	
	
	public void printHeap() {
		System.out.println(Heap);
	}
	
	public void sort() {
		int lastind = this.Heap.size()-1;
		
		for(int i=0; i<lastind; i++) {
			int temp = Heap.get(lastind-i);
			Heap.set(lastind-i, Heap.get(0));
			Heap.set(0, temp);
			heapify(0);
		}
		printHeap();
	}

	
	public static void main(String[] args) {
		Max_Heap h = new Max_Heap();
		int[] arr = {3,4,5,1,0};
		h.createHeap(arr);
		h.sort();
		h.printHeap();
	}

}
