package linkedlist;

import java.util.Scanner;

public class EvenafterOdd {

	public static Node<Integer> evenodd(Node<Integer> head){
	     Node<Integer> curr = head, end = curr, prev = null;
	     
	     while(end.next != null)end = end.next;
	     Node<Integer> new_end = end;
	     
	     while(curr.data % 2 != 0 && curr != end) {
	    	 new_end.next = curr;
	    	 new_end = curr;
	    	 curr = curr.next;
	    	 new_end.next = null; 
	     }
	     
	     if(curr.data % 2 == 0) {
	    	 
	    	 head = curr;
	    	 while(curr != end) {
	    		 if(curr.data % 2 == 0) {
	    			 prev = curr;
	    			 curr = curr.next;
	    		 }
	    		 else {
	    			 prev.next = curr.next;
	    			 curr.next = null;
	    			 new_end.next = curr;
	    			 new_end = curr;
	    			 curr = prev.next;
	    		 }
	    		 
	    	 }
	     }
	    	else prev = curr;
	    	
	    if (new_end != end && end.data %2 != 0)
	        {
	            prev.next = end.next;
	            end.next = null;
	            new_end.next = end;
	        }
	     return head;
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
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = evenodd(head);
		print(head);

	}

}
