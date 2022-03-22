package recursion;

//	find the number of ways in which you can invite n people to your party single or in pair of two

public class InvitePeople {

	public static int invite(int n) {
		if(n <= 1)
			return 1;
		
//		invite n-th people single
		int single = invite(n-1);
		
//		invite n-th people with pair
//		invite n-th people with any (n-1) other people
		int pair = (n-1)*invite(n-2);
		
		return single+pair;
	}

	public static void main(String[] args) {
		System.out.println(invite(4));
	}

}
