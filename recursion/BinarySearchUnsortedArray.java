package recursion;

public class BinarySearchUnsortedArray {

	public static int BinarySearch(int a[], int x, int left, int right) {
		int mid = (left+right)/2, midindex=-1,rightindex=-1,leftindex=-1;
		if(left>right)
			return -1;
		
		leftindex = BinarySearch(a, x, left, mid-1);
		
		if(a[mid] == x)
			midindex = mid;
		
		rightindex = BinarySearch(a, x, mid+1, right);
		
		return (leftindex>-1)? leftindex : (midindex >-1 ? midindex : rightindex);
		
	}

	public static void main(String[] args) {
		int a[] = {1,5,2,1,6,3,2,6};
		System.out.println(BinarySearch(a, 6, 0, a.length-1));

	}

}
