package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInput_LevelWise {
	
	//post order
	public static void postorder(TreeNode<Integer> root) {
		if(root == null)return;
		for(int i = 0; i < root.children.size(); i++) {
			postorder(root.children.get(i));
		}
		System.out.println(root.data);
	}
	
	//no. of leaf nodes...
	public static int no_leaf(TreeNode<Integer> root) {
		if(root == null)return 0;
		if(root.children.size() == 0)return 1;
		int count = 0;
		
		for(int  i = 0; i < root.children.size(); i++) {
			count = count + no_leaf(root.children.get(i));
		}
		return count;
	}
	
	// height of the tree......
	public static int height_tree(TreeNode<Integer> root) {
		if(root == null)return 0;
		
		int ans = 0;
		for(int i = 0; i < root.children.size(); i++) {
			int height = height_tree(root.children.get(i));
			ans = Math.max(ans, height);
		}
		ans += 1;
		return ans; 
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
		//System.out.println(height_tree(root));
		//System.out.println(no_leaf(root));
         postorder(root);
	}

}
