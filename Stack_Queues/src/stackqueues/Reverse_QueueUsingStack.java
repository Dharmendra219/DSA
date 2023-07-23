package stackqueues;

import java.util.*;
public class Reverse_QueueUsingStack {
	
	public static Queue<Integer> rev(Queue<Integer> q){
		Stack<Integer> stack = new Stack<>();
		
		while(!q.isEmpty()) {
			stack.push(q.remove());
		}
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}
		return q;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < 5 ; i++) {
			q.add(i);
		}
		q = rev(q);
		
		System.out.print(q);
	}

}
