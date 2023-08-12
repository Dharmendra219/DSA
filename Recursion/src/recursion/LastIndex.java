package recursion;

public class LastIndex {

	static int ans=-1;
	private static int lastIndex(int[] input, int startIndex, int x) {
          
          if(startIndex > input.length-1) {
              return -1;
          }
          
          if(input[startIndex] == x) {
               ans=startIndex;
          }
          
           lastIndex(input, startIndex + 1, x);
           return ans;
      }
      
      public static int lastIndex(int[] input, int x) {
           return lastIndex(input, 0, x);
      }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {1,8,9,6};
        //int ans = );
        System.out.println(lastIndex(arr,5));
        
    }

}
