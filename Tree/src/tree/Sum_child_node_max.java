package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class max_sum{
	static int sum = Integer.MIN_VALUE;
	static TreeNode<Integer> res = null;
}

public class Sum_child_node_max {
	

    public static TreeNode<Integer> sum_max(TreeNode<Integer> root){
    	
    	if(root == null)return null;
    	int curr_sum = root.data;
    	for(int i = 0; i < root.children.size(); i++) {
    		
    		curr_sum = curr_sum + root.children.get(i).data;
    	}
    	for(int i = 0; i < root.children.size(); i++) {
    		
    		sum_max(root.children.get(i));
    	}
    	if(max_sum.sum < curr_sum) {
    		
    		max_sum.sum = curr_sum;
    		max_sum.res = root;
    	}
    	
    	return max_sum.res;
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
		System.out.println(sum_max(root).data);
		
	}

}
