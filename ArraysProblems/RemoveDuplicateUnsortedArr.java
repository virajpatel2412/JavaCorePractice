package ArraysProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUnsortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,2,5,12,3,6,2,3,6,2,3,6};
		
		Set<Integer> set = new LinkedHashSet<>();
		for(int x : arr) {
			if(!set.contains(x))
				set.add(x);
		}
		
		for(Integer x : set) {
			System.out.print(x+" ");
		}
	}

}
