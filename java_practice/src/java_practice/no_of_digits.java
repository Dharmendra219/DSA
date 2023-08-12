package java_practice;

public class no_of_digits {
	
	public static int count(int n) {
		
		if(n/10==0) {
			return 1;
		}
		return count(n/10)+1;
		
	}
	

	public static void main(String[] args) {
		int x=4000;
		System.out.print(count(x));

	}

}
