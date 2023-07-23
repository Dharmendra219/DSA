package linkedlist;

import java.util.Scanner;

public class  Merge_Two_Sorted_LL {
	
	public static Node<Integer> merge(Node<Integer> a, Node<Integer> b){
		
		Node<Integer> t1 = a, t2 = b, head3 = null, tail3 = null;
		
		while(t1 != null && t2 != null) {
			if(t1.data < t2.data) {
				if(head3 == null) {
					head3 = t1;
					tail3 = t1;
				}
				tail3.next = t1;
				tail3 = t1;
				t1 = t1.next;
			}
			else {
				if(head3 == null) {
					head3 = t2;
					tail3 = t2;
				}	
				tail3.next = t2;
				tail3 = t2;
				t2 = t2.next;
			}
		}
		
		if(t1 == null)tail3.next = t2;
		else if(t2 == null)tail3.next = t1;
		
		return head3;
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
	   Node<Integer> Head = merge(head1, head2);
	   print(Head);
    }

}

