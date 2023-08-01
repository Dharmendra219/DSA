package binay;

public class ConstructTree_post_In {

	public static BinaryTreeNode<Integer> constructTree(int[] post, int st_post, int e_post, int[] in, int st_in, int e_in){
	   if(st_in > e_in)return null;
	   
	   int rootData = post[st_post];
	   BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);	
	   int rootIndex = -1;
	   
	   for(int i = st_in; i <= e_in; i++) {
		   if(in[i] == rootData) {
			   rootIndex = i;
			   break;
		   }
	   }
	   
	   int rightInS = rootIndex + 1;
	   int rightInE = e_in;
	   int rightpostS = st_post - 1;
	   int rightpostE = rightpostS - rightInE + rightInS;
	   int leftInS = st_in;
	   int leftInE = rootIndex - 1;
	   int leftpostS = rightpostE - 1;
	   int leftpostE = e_post;
	   
	   root.right = constructTree(post, rightpostS, rightpostE, in, rightInS, rightInE);
	   root.left = constructTree(post, leftpostS, leftpostE, in, leftInS, leftInE);
	   
	   return root;
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null)return;
		
		String tobePrinted = root.data + "";
		if(root.left != null)tobePrinted += "L:" + root.left.data;
		if(root.right != null)tobePrinted += "R:" + root.right.data;
		System.out.println(tobePrinted);
		
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static void main(String[] args) {
		int in[] = {4,2,5,1,6,3};
		int post[] = {4,5,2,6,3,1};
        BinaryTreeNode<Integer> root = constructTree(post,post.length-1, 0,in,0,in.length-1);
        printTree(root);

	}

}
