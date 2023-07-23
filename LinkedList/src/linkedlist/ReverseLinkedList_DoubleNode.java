package linkedlist;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
}

public class ReverseLinkedList_DoubleNode {
	
	public static DoubleNode reverse(Node<Integer> head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		DoubleNode smallAns = reverse(head.next);
		smallAns.tail.next = head;
		head.next = null;
		smallAns.tail = smallAns.tail.next;
		return smallAns;
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
		Node<Integer> head = takeInput();
		DoubleNode ans = reverse(head);
		print(ans.head);

	}

}
