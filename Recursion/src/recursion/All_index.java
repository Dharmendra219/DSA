package recursion;

public class All_index {

	 private static void AllIndex(int[] input, int startIndex, int x) {
		  
		  if(startIndex > input.length-1) {
			  return ;
		  }
		  
		  if(input[startIndex] == x) {
			  System.out.print(startIndex+" ");
		  }
		  
		   AllIndex(input, startIndex + 1, x);
	  }
	  
	  public static void AllIndex(int[] input, int x) {
		    AllIndex(input, 0, x);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,8,9,6,8};
		//int ans = );
		AllIndex(arr,8);
		
	}

}
