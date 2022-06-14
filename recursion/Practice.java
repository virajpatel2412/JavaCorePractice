package recursion;

public class Practice {
	public static void main(String[] args) {
		Linkedlist<Integer> l = new Linkedlist<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		l.print();
		l.remove(0);

		l.print();
	}
}
