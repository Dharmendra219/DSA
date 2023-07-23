package linkedlist;

import java.util.Scanner;

 public class EvenOdd_bysplit {
	
	public static Node<Integer> evenodd(Node<Integer> head){
		Node<Integer> EvenStart = null;
		Node<Integer> EvenEnd = null;
		Node<Integer> OddStart = null;
		Node<Integer> OddEnd = null;
		Node<Integer> curr = head;
		
		while(curr != null) {
			if(curr.data % 2 == 0) {
				if(EvenStart == null) {
					EvenStart = curr;
					EvenEnd = EvenStart;
				}
				else {
					EvenEnd.next = curr;
					EvenEnd = curr;
				}
			}
			else {
					if(OddStart == null) {
						OddStart = curr;
						OddEnd = OddStart;
					}
					else {
						OddEnd.next = curr;
						OddEnd = curr;
					}
				}
			curr = curr.next;
			}
		
		EvenEnd.next = OddStart;
		head = EvenStart;
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
