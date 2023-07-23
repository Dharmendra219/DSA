package linkedlist;

import java.util.Scanner;

public class ReverseLinkedList_simpler_Tail {
	
	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null || head.next == null)return head;
		head = reverse(head, null, head);
		return head;
	}
	
	public static Node<Integer> reverse(Node<Integer> curr, Node<Integer> prev, Node<Integer> head){
	
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return head;
		}
		Node<Integer> next = curr.next;
		curr.next = prev;
		reverse(next, curr, prev);
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
		//int pos = 0;
		head = reverse(head);
		print(head);
	}
}
