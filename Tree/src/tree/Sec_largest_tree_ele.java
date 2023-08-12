package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sec_largest_tree_ele {
	
	public static TreeNode<Integer> largest = null;
	public static TreeNode<Integer> seclargest = null;
	
	public static TreeNode<Integer> sec_largest(TreeNode<Integer> root){
		if(root == null)return null;
		if(largest == null || seclargest == null) {
			largest = root;
			seclargest = root;
		}
		
		if(root.data > largest.data && seclargest.data < root.data) {
			seclargest = largest;
			largest = root;
		}
		else if(root.data > seclargest.data && root.data < largest.data) {
			seclargest = root;
		}
		
		for(int i = 0; i < root.children.size(); i++) {
			sec_largest(root.children.get(i));
		}
		return seclargest;
	}
	
    public static TreeNode<Integer> takeInputLevelWise(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node data: ");
		int root = sc.nextInt();
		TreeNode<Integer> rootNode = new TreeNode<>(root);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		pendingNodes.add(rootNode);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.remove();
			System.out.println("Enter the Number of Children of "+frontNode.data+": ");
			int childCount = sc.nextInt();
			for(int i = 0; i < childCount ; i++) {
				System.out.println("Enter the "+(i+1)+"th child node of "+frontNode.data+": ");
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(child);
				frontNode.children.add(childNode);
				pendingNodes.add(childNode);
			}
		}
		sc.close();
		return rootNode;
	}
	
	public static void print(TreeNode<Integer> rootNode) {

		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		pendingNodes.add(rootNode);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.remove();
			String s = frontNode.data+": ";
			for(int i = 0; i < frontNode.children.size() ; i++) {
				s = s +frontNode.children.get(i).data+ ",";
				pendingNodes.add(frontNode.children.get(i));
			}
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();

		System.out.println(sec_largest(root).data);
		
	}
}
