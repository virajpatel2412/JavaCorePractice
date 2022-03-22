package recursion;

// check for strictly increasing order or not
public class CheckSorted {

	public static boolean isSorted(int[] a, int ind) {
		if(ind == a.length-1)
			return true;
		
		if(a[ind] >= a[ind+1])
			return false;
		
		return isSorted(a, ind+1);
	}

	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5,6};
		boolean valid = isSorted(a, 0);
		System.out.println(valid);
	}

}
