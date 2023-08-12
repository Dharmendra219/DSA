package recursion;

public class Print_Keypad {
	
	public static void keypad(int n , String OutputSoFar) {
		
		if(n == 0) {
			System.out.println(OutputSoFar);
			return;
		}
		
		String helper = setofcharacters(n % 10);
		
		for(int i = 0; i < helper.length(); i++) {
			keypad(n/10 , helper.charAt(i) + OutputSoFar);
		}
		
	}
	
	public static void keypad(int n) {
		
		keypad(n , "");
		
	}

	private static String setofcharacters(int n) {
		switch(n) {
		case 2: return "abc";
		
		case 3: return "def";
		
		case 4: return "ghi";
		
		case 5: return "jkl";
		
		case 6: return "mno";
		
		case 7: return "pqrs";
		
		case 8: return "tuv";
		
		case 9: return "wxyz";
		
		default:break;
		}
		return "";
	}

	public static void main(String[] args) {
		keypad(239);

	}
	
	
}
