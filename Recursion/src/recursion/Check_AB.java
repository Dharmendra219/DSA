package recursion;

public class Check_AB {
	
	public static boolean check( String s ) {
		
		if( s.length() == 0 ) {
			return true;
		}
		
		if( s.charAt(0) == 'a' ) {
			if( s.substring(1).length() > 1 && s.substring(1,3).equals("bb")) {
              return check(s.substring(3));				
			}else {
				return check(s.substring(1));
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbba";
		System.out.println(check(str));

	}

}
