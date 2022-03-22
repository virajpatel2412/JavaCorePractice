package recursion;

import java.util.ArrayList;

//	Print all possible subset of first N natural number

public class FindSubSet {
	
	private static int count = 0;
	public static void printSubSet(int n, ArrayList<Integer> subset) {
		
		if(n==0) {
			System.out.println("subset -- "+(++count)+"  "+subset);
			return ;
		}
		
		subset.add(n);
		printSubSet(n-1, subset);
		
		subset.remove(subset.size()-1);
		printSubSet(n-1, subset);
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		printSubSet(2, list);
	}

}
