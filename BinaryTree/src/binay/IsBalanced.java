package binay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsBalanced {
	
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
	
	public static int height(BinaryTreeNode<Integer> root) {
		
		if(root == null)return 0;
		
		int left_height = height(root.left);
		if(left_height == -1)return -1;
		
		int right_height = height(root.right);
		if(right_height == -1)return -1;
		
		if(Math.abs(right_height - left_height) > 1)return -1;
		
		return 1 + Math.max(left_height, right_height);
	}
	public static boolean balanced(BinaryTreeNode<Integer> root) {
		return height(root) != -1;
	}
	
	// remove leaf Nodes
	public static BinaryTreeNode<Integer> remove_leaf_Nodes(BinaryTreeNode<Integer> root) {
		 if(root == null)return null;
		 if(root.left == null && root.right == null) {
				 
				 return null;
				
			}
		root.left = remove_leaf_Nodes(root.left);
		root.right = remove_leaf_Nodes(root.right);
       
		return root;
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		
		String tobePrinted = root.data + " :";
		if(root.left != null)tobePrinted += "L:" + root.left.data + ",";
		if(root.right != null)tobePrinted += "R:" + root.right.data;
		System.out.println(tobePrinted);
		
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise(s);
		
		System.out.println(balanced(root));
        BinaryTreeNode<Integer> root1 = remove_leaf_Nodes(root);
        printTree(root1);
	}

}
