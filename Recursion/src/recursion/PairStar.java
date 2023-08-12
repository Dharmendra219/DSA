package recursion;

public class PairStar {
	
	//static String ans = "";
	
	public static String pairstar(String s) {
		if(s.length() == 0) {
			return null;
		}
		if(s.length() == 1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			return s.charAt(0)+"*"+ pairstar(s.substring(1));
		}else {
			return s.charAt(0)+pairstar(s.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaa";
		System.out.print(pairstar(str));

	}

}
