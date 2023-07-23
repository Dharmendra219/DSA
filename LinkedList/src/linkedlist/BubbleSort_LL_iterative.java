package linkedlist;

import java.util.Scanner;

public class BubbleSort_LL_iterative {
	
	 public static Node<Integer> sort(Node<Integer> head){
		 if(head == null || head.next == null)return head;
		 Node<Integer> curr = head;
		 int count = 0;
		 while(curr != null) {
			 count++;
			 curr = curr.next;
		 }
		 
		 for(int i = 0; i < count-1; i++) {
			 curr = head;
			 Node< Integer> prev = null, next = curr.next;
			 
			 while(curr.next != null) {
				 if(curr.data > curr.next.data) {
					 if(prev == null) {
						 curr.next = next.next;
						 next.next = curr;
						 prev = next;
						 head = prev;
					 }
					 else {
						 next = curr.next;
						 curr.next = next.next;
						 prev.next = next;
						 next.next = curr;
						 prev = next;
					 }
				 }
				 else {
					 prev = curr;
					 curr = curr.next;
				 }
			 }
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
			head = sort(head);
			print(head);

		}
}
