package recursion;

public class Print_Numbers {
	
	public static void numbers(int n) {
		if(n ==1) {
			System.out.print(n+" ");
			return;
			
		}
		
		numbers(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		numbers(n);
	}

}
