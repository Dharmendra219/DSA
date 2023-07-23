package linkedlist;

import java.util.Scanner;

public class ReverseLinkedList_Recursive {

	public static Node<Integer> reverse(Node<Integer> head){
		
		if(head == null || head.next == null)return head;
		
		Node<Integer> rest = reverse(head.next);
		head.next.next = head;
		head.next = null;
		
		return rest;
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
		head = reverse(head);
		print(head);
	}
}

