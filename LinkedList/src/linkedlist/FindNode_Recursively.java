package linkedlist;

import java.util.Scanner;

public class FindNode_Recursively {
    static int count = 0;
	
    public static int findNode(Node<Integer> head, int n) {
    	if(head == null || head.next == null)return -1;
    	if(head.data == n)return count;
    	count = findNode(head.next, n);
    	if(count != -1)count++;
    	return count;
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

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int count = findNode(head, 5);
        System.out.println(count);
	}
}
