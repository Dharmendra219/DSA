package linkedlist;

import java.util.Scanner;

public class ReverseLinkedList_Iterative {
	
	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> prev = null, curr = head, next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
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
