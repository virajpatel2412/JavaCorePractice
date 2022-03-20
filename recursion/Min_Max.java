package recursion;

public class Min_Max {

	public static void findminmax(int a[], int left, int right, int[] minmax) {

		if (left == right) {
			minmax[0] = a[left];
			minmax[1] = a[left];
		} 
		else if (left == right - 1) {
			if (a[left] < a[right]) {
				minmax[0] = a[left];
				minmax[1] = a[right];
			} else {
				minmax[0] = a[right];
				minmax[1] = a[left];
			}
		} 
		else {
			int mid = (left + right) / 2;
			int newminmax[] = {0,0};

			findminmax(a, left, mid, minmax);
			findminmax(a, mid + 1, right, newminmax);

			if (newminmax[0] < minmax[0])
				minmax[0] = newminmax[0];

			if (newminmax[1] > minmax[1])
				minmax[1] = newminmax[1];
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 6,3,6,3,7,8,34,1,34,6,43,-12};
		int minmax[] = {0,0};
		
		findminmax(a, 0, a.length - 1, minmax);
		
		System.out.println("Min : " + minmax[0] + " Max : " + minmax[1]);
	}
}
