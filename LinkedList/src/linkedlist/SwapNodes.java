package linkedlist;

import java.util.Scanner;

public class SwapNodes {

	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j){
		
		if(i == j)return head;
		
		Node<Integer> prevX = null, currX = head;
		while(currX != null && i > 0) {
			prevX = currX;
			currX = currX.next;
			i--;
		}
		
		Node<Integer> prevY = null, currY = head;
		while(currY != null && j > 0) {
			prevY = currY;
			currY = currY.next;
			j--;
		}
		
		if(currX == null || currY == null)return head;
		
		if(prevX != null)prevX.next = currY;
		else head = currY;
		
		if(prevY != null)prevY.next = currX;
		else head = currX;
		
		Node<Integer> temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
		
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
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		int i = 3, j = 4;
		head = swapNodes(head,i,j);
		print(head);

	}
}
