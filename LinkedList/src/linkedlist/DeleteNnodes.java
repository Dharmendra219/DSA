package linkedlist;

import java.util.Scanner;

public class DeleteNnodes {
	public static Node<Integer> delete(Node<Integer> head, int m, int n){
		Node<Integer> curr = head;
		Node<Integer> forward = null;
		
		while(curr != null) {
			int i = 1, j = 1;
			while(i < m && curr != null) {
				curr = curr.next;
				i++;
			}
			if(curr == null)return head;
			forward = curr.next;
			while(j <= n && forward != null) {
				forward = forward.next;
				j++;
			}
			curr.next = forward;
			curr = forward;
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
		int m =2, n=3;
		head = delete(head,m,n);
		print(head);

	}
}
