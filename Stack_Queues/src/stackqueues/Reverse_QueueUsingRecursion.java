package stackqueues;

import java.util.*;
public class Reverse_QueueUsingRecursion {

	public static Queue<Integer> rev(Queue<Integer> q){
		if(q.isEmpty())return q;
		int temp = q.remove();
		q = rev(q);
		q.add(temp);
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < 5 ; i++) {
			q.add(i);
		}
		System.out.print(q+"\n");
		
		q = rev(q);
		
		System.out.print(q);

	}

}
