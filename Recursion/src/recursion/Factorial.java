package recursion;

public class Factorial {
	
	public static int fac(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return n*fac(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		System.out.print(fac(n));
	}

}
