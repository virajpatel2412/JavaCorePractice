package dynamicPrograming;

public class KnapSack {
	
	public static void findObjs(int[][] objs, int[][] count, int n, int m) {
		if(n==0 && m==0)
			return;
		int profit = count[n][m];
		if(count[n][m] != count[n-1][m]) {
			profit -= objs[1][n-1];
			while(profit != count[n][m] ) {
				m--;
			}
			findObjs(objs, count, n, m);
			System.out.print(n-1+" ");

		}
		else {
			findObjs(objs, count, n-1, m);
		}
		
	}
	
	public static void knapsack(int[][] objs, int weight) {
		int[][] count = new int[objs[0].length+1][weight+1];
	
		for(int i=1; i<=objs[0].length; i++) {
			for(int j=1; j<=weight; j++) {
				if(objs[0][i-1] > j)
					count[i][j] = count[i-1][j];
				else {
					count[i][j] = Math.max(objs[1][i-1] + count[i-1][j-objs[0][i-1]], count[i-1][j]);
				}
			}
		}
		for(int[] a : count) {
			for(int x : a) {
				System.out.printf("%5d",x);
			}
			System.out.println();
		}
		System.out.println("Amount of profit you will get is : "+count[count.length-1][weight]);
		System.out.print("Index of selected items is : ");
		findObjs(objs, count, count.length-1, count[0].length-1);
	}
	
	public static void main(String[] args) {
		
//		objs[0][i]   ---  represent the weight of the object i
//		objs[1][i]   ---  represent the profit given by the object i
		
		int[][] objs = {{2,6,13,6,3,3},{12,24,51,11,5,3}};
		knapsack(objs, 12);
	}

}
