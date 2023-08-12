package java_practice;

public class Pow_x {
    
	public static int Pow(int x,int n) {
		
		if( n == 0 ) {
			
			return 1;
			
		}
		
		return x*Pow(x,n-1);
		
	}
	
	public static void main(String[] args) {
		
		int base = 2 , exponent = 7;
		
		System.out.print(Pow(base,exponent));
		
	}

}
