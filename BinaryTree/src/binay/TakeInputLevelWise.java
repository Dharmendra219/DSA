package binay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		
		String tobePrinted = root.data + " :";
		if(root.left != null)tobePrinted += "L:" + root.left.data + ",";
		if(root.right != null)tobePrinted += "R:" + root.right.data;
		System.out.println(tobePrinted);
		
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(Scanner s){
		//Scanner s = new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
		
		System.out.println("Enter the root data: ");
		int rootData = s.nextInt();
		if(rootData == -1)return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.remove();
			System.out.println("Enter the left-child of "+front.data+": ");
			int leftChild = s.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
				pendingNodes.add(child);
				front.left = child;
			}
			System.out.println("Enter the right-child of "+front.data+": ");
			int rightChild = s.nextInt();
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				pendingNodes.add(child);
				front.right = child;
			}
		}
		return root;
	}
	// Types of Traversals : 
	public static void inorder(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void preorder(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		System.out.print(root.data +" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise(s);
		//printTree(root);
		preorder(root);
		postorder(root);
		inorder(root);
		s.close();
	}
	
}
