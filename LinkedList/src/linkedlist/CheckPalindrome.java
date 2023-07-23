package linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
	
	public static boolean palindrome(Node<Integer> head) {
		if(head == null || head.next == null)return true;
		
		Node<Integer> temp = head;
		Stack<Integer> s = new Stack<Integer>();
		
		while(temp != null) {
			s.push(temp.data);
			temp = temp.next;
		}
		
		while(head != null) {
			if(s.peek() == head.data) {
				s.pop();
				head = head.next;
			}
			else return false;
		}
		return true;
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
		boolean res = palindrome(head);
		System.out.println(res);
	}
}

