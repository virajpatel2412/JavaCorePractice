package recursion;

//	We have surface of N*M 
// We have tiles of 1*M area 
// Count How many ways we can cover the surface using tiles

public class PlaceTiles {

	public static int countWays(int n, int m) {
		
		if(n==2 && m==2)
			return 2;
		if(n<m)
			return 1;
		
		int h = countWays(n-1, m);
		int v = countWays(n-m, m);
		
		return h+v;
	}

	public static void main(String[] args) {
		int totalWays = countWays(4,2);
		System.out.println(totalWays);
	}

}
