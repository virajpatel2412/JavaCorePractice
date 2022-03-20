package recursion;

public class BinarySearch {

	public static int Search(int a[], int x, int left, int right) {
		int mid = (left+right)/2;
		if(left>right)
			return -1;
		if(x == a[mid])
			return mid;
		if(x < a[mid])
			return Search(a, x, left, mid-1);
		else if(x>a[mid])
			return Search(a, x, mid+1, right);
		else
			return -1;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8};
		System.out.println(Search(a,8,0,a.length-1));
	}
}
