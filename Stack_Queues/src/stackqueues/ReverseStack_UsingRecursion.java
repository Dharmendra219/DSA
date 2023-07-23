package stackqueues;

import java.util.*;
public class ReverseStack_UsingRecursion {
	static Stack<Integer> s = new Stack<>();
	
	public static void insert_at_bottom(int element) {
		if(s.isEmpty())s.push(element);
		else {
			int temp = s.pop();
			insert_at_bottom(element);
			
			s.push(temp);
		}
	}
	public static void reverse() {
		if(!s.isEmpty()) {
			int temp = s.pop();
			reverse();
			insert_at_bottom(temp);
		}
	}
	public static void main(String[] args) {
		
		s.push(1);
		s.push(2);
		s.push(3);
		reverse();
	    int StackSize = s.size();
	    for(int i = 0; i < StackSize; i++) {
	    	System.out.println(s.pop());
	    }

	}

}
