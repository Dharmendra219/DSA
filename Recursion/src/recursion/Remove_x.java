package recursion;

public class Remove_x {
	
	public static String remove(String s) {
		if(s.length() == 0) {
			return s;
		}
		if(s.charAt(0) == 'a') {
			
			return 'x' + remove(s.substring(1));
		}
		else {
			return s.charAt(0)+remove(s.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aba";
		System.out.print(remove(str));

	}

}
