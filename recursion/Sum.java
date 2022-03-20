package recursion;

public class Sum {

	public static int sum(int n) {
		if(n == 1)
			return 1;
		return n+sum(n-1);
	}
	
	public static int sum(int[] a, int left, int right) {
		if(left == right)
			return a[left];
		
		if(left == right-1)
			return a[left]+a[right];
		
		int mid = (left+right)/2;
		return sum(a, left, mid)+sum(a,mid+1,right);
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(6));
		
		int a[] = {1,2,3,4,5,6};
		System.out.println(sum(a, 0, a.length-1)) ;
	}

}
