package stackqueues;

import java.util.Stack;
import java.util.Scanner;

public class Reverse_StackUsingEmptyStack {
	
	public static Stack<Integer> reverseStack(Stack<Integer> s){
		int n = s.size();
		Stack<Integer> tempStack = new Stack<>();
		for(int i = 0; i < n; i++) {
			int temp = s.pop();
			
			tempStack.push(temp);
		}
		
		return tempStack;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		int n = 5;
		while(n > 0) {
			int ele = sc.nextInt();
			s.push(ele);
			n--;
		}
        s = reverseStack(s);
        int l = s.size();
        for(int i = 0 ; i < l; i++) {
        	System.out.println(s.pop());
        }
        sc.close();
	}

}
