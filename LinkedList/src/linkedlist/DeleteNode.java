package linkedlist;

import java.util.Scanner;

public class DeleteNode {
	
	public static Node<Integer> delete(Node<Integer> head, int pos) {
		int i = 0;
		Node<Integer> temp = head;
		if(pos == 0) {
			head = head.next;
			return head;
		}
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		if(temp == null ||temp.next == null)return null;
			temp.next = (temp.next).next;
		
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
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		int pos = 0;
		head = delete(head,pos);
		print(head);
		

	}

}
