package recursion;

public class TowerOfHanoi {

	public static int count = 0;
	public static void towerOfHanoi(int n, char source, char helper, char dest) {
		if(n==1) {
			System.out.println("Move disk "+n+" from "+source+" to "+dest+"    --- "+(++count));
			return;
		}
		
		towerOfHanoi(n-1,source,dest,helper);
		System.out.println("Move disk "+n+" from "+source+" to "+dest+"    --- "+(++count));
		towerOfHanoi(n-1,helper,source,dest);
	}

	public static void main(String[] args) {
		
		towerOfHanoi(20,'s','h','d');

	}

}
