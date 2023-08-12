package recursion;

public class FirstIndex {
	
	  private static int firstIndex(int[] input, int startIndex, int x) {
		  
		  if(startIndex > input.length-1) {
			  return -1;
		  }
		  
		  if(input[startIndex] == x) {
			  return startIndex;
		  }
		  
		  return firstIndex(input, startIndex + 1, x);
	  }
	  
	  public static int firstIndex(int[] input, int x) {
		   return firstIndex(input, 0, x);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,9,6,8};
		//int ans = );
		System.out.println(firstIndex(arr,8));
		
	}

}
