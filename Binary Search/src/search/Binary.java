package search;

public class Binary {
	
	public static int binarySearch(int[] arr,int start,int end,int k) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(k==arr[mid]) {
				return mid;
			}
			else if(k>arr[mid]) {
				//return binarySearch(arr,mid+1,end,k);
				start = mid + 1;
				
			}
			else if(k<arr[mid]){
				 //return binarySearch(arr,0,mid-1,k);
				 end = mid - 1; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,6,8,4};
		int size=arr.length;
		int k=6;
		int ans=binarySearch(arr,0,size-1,k);
		System.out.print(ans);
		
	}

}
