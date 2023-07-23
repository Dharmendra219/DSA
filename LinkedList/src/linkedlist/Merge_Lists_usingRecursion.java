package linkedlist;

import java.util.Scanner;

public class Merge_Lists_usingRecursion {
	
	public static Node<Integer> sorted(Node<Integer> A, Node<Integer> B){
		if(A == null)return B;
		if(B == null)return A;
		
		if(A.data < B.data) {
			A.next = sorted(A.next, B);
			return A;
		}
		else {
			B.next = sorted(A, B.next);
			return B;
		}
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
		
		   Node<Integer> head1 = takeInput();
		   Node<Integer> head2 = takeInput();
		   Node<Integer> Head = sorted(head1, head2);
		   print(Head);
	    }

	}
