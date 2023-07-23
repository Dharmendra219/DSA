package linkedlist;

import java.util.*;

public class InserNode {
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		Node<Integer> temp = head;
		int i = 0;
		while(i < pos - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
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
				tail = tail.next;	
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
        int data = 80, pos = 0;
        head = insert(head,data,pos);
        print(head);
	}
}
