package recursion;

public class TowerOfHanoi {
	
	public static void towerofhanoi(int n,String a, String b, String c) {
		if(n==1) {
			System.out.println(a+" "+c);
			return;
		}
		 towerofhanoi(n-1,a,c,b);
		 System.out.println(a+" "+c);
		 towerofhanoi(n-1,b,a,c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		towerofhanoi(2,"a","b","c");

	}

}
