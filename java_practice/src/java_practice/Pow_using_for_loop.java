package java_practice;

public class Pow_using_for_loop {
	
	public static int Pow(int x , int n) {
		
		int result = 1;
		
		for(; n> 0 ; --n ) {
			
			result*= x;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int base = 3,exponent=4;
		
		System.out.print(Pow(base,exponent));
		
	}

}
