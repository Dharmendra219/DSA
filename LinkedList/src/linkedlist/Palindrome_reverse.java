package linkedlist;

import java.util.Scanner;

public class Palindrome_reverse {
	static Node<Integer> fast, slow, secondHalf;
	
	public static boolean palindrome(Node<Integer> head) {
	    slow = head;
	    fast = head;
	   Node<Integer> prev_slow = null;
	    Node< Integer> midNode = null;
		boolean res = true;
		
		if(head != null && head.next != null) {
			while(fast != null && fast.next !=null) {
				fast = fast.next.next;
				prev_slow = slow;
				slow = slow.next;
			}
			if(fast != null) {
				midNode = slow;
				slow = slow.next;
			}
		secondHalf = slow;
		prev_slow.next = null;
		reverse();
		res = CompareList(head , secondHalf);
		reverse();
		
		if(midNode != null) {
			midNode.next = secondHalf;
			prev_slow.next = midNode;
		}
		else prev_slow.next = secondHalf;
		}
		return res;
	}
	
	 public static void reverse(){
		Node<Integer> prev = null, curr = secondHalf, next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		secondHalf = prev;
	}
	 
	 public static boolean CompareList(Node<Integer> head1, Node<Integer> head2) {
		 while(head1 != null && head2 != null) {
			 if(head1.data == head2.data) {
			   head1 = head1.next;
			   head2 = head2.next;
			 }
				 else return false;
		 }
		 if(head1 ==null && head2 == null)return true;
		 return false;
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

			Node<Integer> head = takeInput();
			System.out.println(palindrome(head));
		}
	}

