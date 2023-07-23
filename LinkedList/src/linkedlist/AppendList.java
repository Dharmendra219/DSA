package linkedlist;

import java.util.Scanner;

public class AppendList {
	
	public static Node<Integer> append(Node<Integer> head,int pos){
		Node<Integer> temp1 = head;
		//Node<Integer> temp2 = head;
		int i = 1; 
		while(temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = head;
		temp1 = head;
		while(i < pos-1) {
			temp1 = temp1.next;
			i++;
		}
		head = temp1.next;
		temp1.next = null;
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
		int pos = 4;
		head = append(head,pos);
		print(head);
	}
}

