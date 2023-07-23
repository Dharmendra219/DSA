package linkedlist;

import java.util.Scanner;

public class MergeSort {
	
	public static Node<Integer> sortedMerge(Node<Integer> a, Node<Integer> b){
		
		Node<Integer> result = null;
		if(a == null)return b;
		if(b == null)return a;
		
		if(a.data <= b.data) {
			result = a;
			result.next = sortedMerge(a.next, b);
		}
		else {
			result = b;
			result.next = sortedMerge(a, b.next); 
		}
		return result;
	}

	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head == null || head.next == null)return head;
		Node<Integer> middle = getMiddle(head);
		Node<Integer> nextofMiddle = middle.next;
		middle.next = null;
		
		Node<Integer> left = mergeSort(head);
		Node<Integer> right = mergeSort(nextofMiddle);
		
		Node<Integer> sortedList = sortedMerge(left, right);
		return sortedList;
	}
	
	public static Node<Integer> getMiddle(Node<Integer> head){
		
		if(head == null)return head;
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
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
		head = mergeSort(head);
		print(head);

	}

}
