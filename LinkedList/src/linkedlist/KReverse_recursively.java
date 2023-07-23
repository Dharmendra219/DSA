package linkedlist;

import java.util.Scanner;

public class KReverse_recursively {
	
	public static Node<Integer> reverse(Node<Integer> head, int k){
		
		if(head == null)return head;
		
		Node<Integer> curr = head, prev = null, next = head;
		
		int count = 0;
		
		while(count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		if(next != null) {
			head.next = reverse(next, k);
		}
		return prev;
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
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		//int pos = 0;
		head = reverse(head,3);
		print(head);
		

	}

}
