package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Element_x {
	static boolean flag = false;
	public static boolean search(TreeNode<Integer> root, int ele) {
		if(root == null)return false;
		
		if(root.data == ele)flag = true;
		
		for(int i = 0; i < root.children.size(); i++) {
			if(flag == true)break;
			search(root.children.get(i),ele);
		}
		return flag;
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
		//print(root);
		System.out.println(search(root,5));
		
	}
}
