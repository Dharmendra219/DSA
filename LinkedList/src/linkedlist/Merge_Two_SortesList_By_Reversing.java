package linkedlist;

import java.util.Scanner;

public class Merge_Two_SortesList_By_Reversing {
	
	public static Node<Integer> sort(Node<Integer> a,Node<Integer> b){
		Node<Integer> head = null;
		Node<Integer> temp;
		
		a = reverse(a);
		b = reverse(b);
		while(a != null && b != null) {
			if(a.data > b.data) {
				temp = a.next;
				a.next = head;
				head = a;
				a = temp;
			}
			else {
				temp = b.next;
				b.next = head;
				head = b;
				b = temp;
			}
		}
		while(b != null) {
			temp = b.next;
			b.next = head;
			head = b;
			b = temp;
		}
		while(a != null) {
			temp = a.next;
			a.next = head;
			head = a;
			a = temp;
		}
		
		return head;
	}
	
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
		//sc.close();
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
	Node<Integer> head1 = takeInput();
	Node<Integer> head2 = takeInput();
	Node<Integer> head = sort(head1, head2);
	print(head);

}

}

