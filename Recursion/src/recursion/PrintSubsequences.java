package recursion;

public class PrintSubsequences {
	
	public static void printsubsequences(String input , String OutputSoFar) {
		
		if(input.length() == 0) {
			System.out.println(OutputSoFar);
			return;
		}
		
		printsubsequences(input.substring(1) , OutputSoFar);
		printsubsequences(input.substring(1) , OutputSoFar + input.charAt(0));
	}
	
	public static void printsubsequences(String input) {
		printsubsequences(input , "" );
	}

	public static void main(String[] args) {
		
    printsubsequences("xyz");
		
	}

}
