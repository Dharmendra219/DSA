package recursion;

public class X_to_power_n {
	
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		return x*power(x,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1000;
		int n = 10;
		System.out.print(power(x,n));
	}

}
