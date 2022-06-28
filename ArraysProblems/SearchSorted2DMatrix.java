package ArraysProblems;

public class SearchSorted2DMatrix {

	public static boolean search(int[] arr, int key, int left, int right) {
		if(left <= right) {
			int mid = (left + right)/2;
			if(arr[mid] == key) {
				return true;
			}
			else if(arr[mid] < key)
				return search(arr, key, mid+1, right);
			else
				return search(arr, key, left, mid-1);
		}
		return false;
	}
	public static boolean search(int[][] arr, int key, int left, int right) {
		if(left <= right) {
			int mid = (left + right)/2;
			
			if(arr[mid][0] <= key && arr[mid][arr[mid].length-1] >= key) {
				return search(arr[mid], key,  0, arr[mid].length-1);
			}
			else if(arr[mid][arr[mid].length-1] < key ) {
				return search(arr, key, mid+1, right);
			}
			else
				return search(arr, key, left, mid-1);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int key = 3;
		System.out.println(search(arr, 34, 0, arr.length-1));
	}

}
