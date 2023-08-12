package recursion;

public class GeometricSum {
	
	static float sum ;
	static int n = 0;
	public static float geometricSum(int k) {
		
		if( k == 0 ) {
			return 0;
		}
		
		sum+=(float)1/(pow(n));
		n++;
		geometricSum(k-1);
		return sum;
	}
	
	public static int pow(int x) {
		if(x == 0) {
			return 1;
		}
		
		return 2*pow(x-1);
	}

	public static void main(String[] args) {
	
		int power = 4;
		System.out.print(geometricSum(power));
	}

}
