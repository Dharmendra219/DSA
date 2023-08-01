package binay;
import java.util.*;

public class TakeInput_print_recursively {
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		
		String tobePrinted = root.data + "";
		if(root.left != null)tobePrinted += "L:" + root.left.data;
		if(root.right != null)tobePrinted += "R:" + root.right.data;
		System.out.println(tobePrinted);
		
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		int rootData;
		System.out.println("Enter the root data: ");
		rootData = s.nextInt();
		
		if(rootData == -1)return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		root.left = takeInput(s);
		root.right  = takeInput(s);
		return root;
	}
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		printTree(root);
	}
}
