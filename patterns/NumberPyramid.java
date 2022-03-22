package patterns;

/*

        5 
      4 5 6 
    3 4 5 6 7 
  2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 

 */

public class NumberPyramid {

	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			int count = 0;
			for(int j=1; j<i; j++) {
				count++;
				System.out.print("  ");
			}
			for(int j=1; j<=(6-i)*2-1; j++) {
				System.out.print(++count+" ");
			}
			System.out.println();
		}
	}

}
