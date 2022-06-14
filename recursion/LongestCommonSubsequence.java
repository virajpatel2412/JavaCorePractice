package recursion;

//  Return the length of the Longest Common Substring

public class LongestCommonSubsequence {

	public static int lcs(String a, String b, int i, int j) {
		if(i<=0 || j<=0) {
			return 0;
		}
		if(a.charAt(i-1) == b.charAt(j-1))
			return 1+lcs(a, b, i-1, j-1);
		else {
			return Math.max(lcs(a,b,i-1,j), lcs(a,b,i,j-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = lcs("absdfasbdb","absfazxz",10,8);
		System.out.println(a);
	}

}
