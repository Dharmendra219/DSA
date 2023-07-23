package linkedlist;

import java.util.*;
class Node<T>{
	T data;
	Node <T> next;
	Node(T data){
		this.data = data;
		next = null;
	}
}

public class TakeInput {

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
				
				Node<Integer> temp = tail;
				tail = newNode;
				temp.next = tail;
				temp = temp.next;
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
		
		Node<Integer> head1 = takeInput();
	    
		print(head1);

		
	}

}
