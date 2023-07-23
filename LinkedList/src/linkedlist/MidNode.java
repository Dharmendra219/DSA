package linkedlist;

import java.util.Scanner;

public class MidNode {
	
	public static Node<Integer> mid(Node<Integer> head){
		Node<Integer> slow = head, fast = head, prev_slow = null,midNode;
		
		if( head.next == null)return head;
		
	    while(fast != null && fast.next != null) {
	    	fast = fast.next.next;
	    	prev_slow = slow;
	    	slow = slow.next;
	    }
	    
	    if(fast != null) {
	        midNode = slow;
	    	slow = slow.next;
	    }
	    else {
	    	midNode = prev_slow;
	    }
	    
	    return midNode;
	}
	 public static Node<Integer> takeInput(){
			Node<Integer> head = null, tail = null;
			Scanner sc = new Scanner(System.in);
			int data = sc.nextInt();
			
			while(data != -1) {
				Node<Integer> newNode = new Node<Integer>(data);
				if(head == null) {
					head = newNode;
				    tail = newNode;
		     	}
				else {
					tail.next = newNode;
					tail = newNode;
				}
				data = sc.nextInt();
			}
			sc.close();
			return head;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> ans = mid(head);
		System.out.println(ans.data);

	}

}

