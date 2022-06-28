package ArraysProblems;

import java.util.ArrayList;
import java.util.Collections;

/*
	Given an array of intervals, merge all the overlapping intervals 
	and return an array of non-overlapping intervals.
	
	Input: intervals=[[1,3],[2,6],[8,10],[15,18]]

	Output: [[1,6],[8,10],[15,18]]

	Explanation: Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6]
 	intervals.
*/


public class MergeOverlappingIntervals {
	
	static class Pair{
		int first, last;
		Pair(int a, int b){
			first = a;
			last = b;
		}
		public String toString() {
			return "{ "+first+", "+last+" }";
		}
	}
	
	public static ArrayList<Pair> merge(ArrayList<Pair> list){
		if(list.size() <= 1)
			return list;
		
		Collections.sort(list, (a, b)-> a.first-b.first);
		
		ArrayList<Pair> res = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(res.isEmpty()) {
				res.add(list.get(i));
			}
			if(res.get(res.size()-1).last > list.get(i).first) {
				Pair temp = new Pair(res.get(res.size()-1).first, list.get(i).last);
				res.set(res.size()-1, temp);
			}
			else {
				res.add(list.get(i));
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pair> list = new ArrayList<>();
		list.add(new Pair(1,3));
		list.add(new Pair(2,4));
		list.add(new Pair(9,11));
		list.add(new Pair(15,18));
		list.add(new Pair(16,17));
		list.add(new Pair(2,6));
		list.add(new Pair(8,9));
		list.add(new Pair(8,10));

		
		ArrayList<Pair> res = merge(list);
		System.out.println(res);
	}

}
