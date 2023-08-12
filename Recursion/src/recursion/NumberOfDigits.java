package recursion;

public class NumberOfDigits {
	static int count = 0;
	
	public static int no_of_digits(int number) {
		if(number == 0) {
			return 0;
		}
		else {
			
			count++;
			no_of_digits(number/10);
			return count;
		}
	}

	public static void main(String[] args) {

		int x = 156;
	//	NumberOfDigits n = new NumberOfDigits();
		System.out.print(NumberOfDigits.no_of_digits(x));

	}

}
