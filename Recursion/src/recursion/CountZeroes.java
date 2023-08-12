package recursion;

public class CountZeroes {
	
	static int count = 0;
	
	public static int countingzeroes(int number) {
		
		if(number == 0) {
			return 0;
		}
		
		if(number%10 == 0) {
			count++;
		}
		countingzeroes(number/10);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =1000025;
		//System.out.println(n);
		System.out.print(countingzeroes(n));
	}

}
