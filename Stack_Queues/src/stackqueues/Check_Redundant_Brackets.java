package stackqueues;

import java.util.*;

public class Check_Redundant_Brackets {

	public static boolean findRedundant(String s) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ')') {
			  char top = st.pop();
			  boolean flag = true;
			  while(top != '(') {
				if(top == '+' || top == '-' || top == '*' || top == '/') {
					//st.pop();
					flag = false;
				}
				top = st.pop();
			}
			  if(flag == true)return true;
			}
			else {
				st.push(s.charAt(i));
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(findRedundant(str));
		sc.close();
	}
}
