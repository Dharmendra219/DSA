package recursion;

public class Staircase {
	
	public static int stairHelper(int currStep,int dp[] , int n) {
		
		if(currStep > n)return 0;
		
		if(dp[currStep] != -1)return dp[currStep];
		if(currStep == n)return 1;
		
		int oneStep = stairHelper(currStep + 1,dp ,n);
		int twoStep = stairHelper(currStep + 2,dp, n);
		int thirdStep = stairHelper(currStep + 3,dp, n);
		
		int totalway =  (oneStep + twoStep + thirdStep);
		dp[currStep] = totalway;
		return totalway;
	}
	
	public static int stair(int n) {
		int dp[] = new int[n+1];
		for(int i = 0; i < dp.length; i++)dp[i]=-1;
		
		int totalway = stairHelper(0,dp, n);
		return totalway;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(stair(n));

	}

}
