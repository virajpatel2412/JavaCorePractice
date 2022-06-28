package ArraysProblems;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int n = 5;
		
		ArrayList<Integer> sublist;
		ArrayList<Integer> prev = null;
		for(int i=0; i<n; i++) {
			sublist = new ArrayList<>();
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i) {
					sublist.add(1);
				}
				else {
					sublist.add(prev.get(j-1)+prev.get(j));
				}
			}
			prev = sublist;
			list.add(sublist);
		}
		System.out.print(list);
	}

}
