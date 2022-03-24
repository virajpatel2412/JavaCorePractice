package dynamicPrograming;

public class LongestCommonSubstring {
	
	public static void print(String a, String b,char[][] track, int n, int m) {
		if(n == 0 || m == 0)
			return;
		if(track[n][m] == 'c') {
			print(a,b,track, n-1, m-1);
			System.out.print(a.charAt(n-1));
		}
		else if(track[n][m] == 'l')
			print(a,b,track, n, m-1);
		else
			print(a,b,track, n-1, m);			
	}
	
	public static void lcs(String a, String b) {
		int n = a.length();
		int m = b.length();
		
		int count[][] =  new int[n+1][m+1];
		char track[][] = new char[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					count[i][j] = count[i-1][j-1]+1;
					track[i][j] = 'c';
				}
				else {
					if(count[i-1][j] > count[i][j-1]) {
						count[i][j] = count[i-1][j];
						track[i][j] = 'u';
					}
					else {
						count[i][j] = count[i][j-1];
						track[i][j] = 'l';
					}
				}
			}
		}
		print(a,b,track, n, m);
	}

	public static void main(String[] args) {
		lcs("aasdasdvs","aaadvzdps");
	}

}
