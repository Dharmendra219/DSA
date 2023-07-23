package linkedlist;

import java.util.Scanner;

public class Palindrome_Recursion {
	 static Node<Integer> left,head;
	
	public static boolean isPalindromeUtil(Node<Integer> right) {
		left = head;
		
		if(right == null)return true;
		
		boolean isp = isPalindromeUtil(right.next);
		if(isp == false)return false;
		
		boolean isp1 = (right.data == left.data);
		left = left.next;
		return isp1;
	}
	
	public static boolean Palindrome(Node<Integer> head) {//for checking the list without losing head //
		boolean result = isPalindromeUtil(head);
		return result;
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
		head = takeInput();
		boolean ans = Palindrome(head);
		System.out.println(ans);

	}

}
