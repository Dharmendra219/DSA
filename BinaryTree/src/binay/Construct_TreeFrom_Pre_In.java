package binay;

public class Construct_TreeFrom_Pre_In {

	public static BinaryTreeNode<Integer> construct_tree(int pre[], int st_pre, int e_pre, int in[], int st_in, int e_in){
		if(st_in > e_in)return null;
		int rootData = pre[st_pre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		int rootIndex = -1;
		
		for(int i = st_in; i <= e_in; i++) {
			if(in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		int leftInS = st_in;
		int leftInE = rootIndex - 1;
		int leftPreS = st_pre + 1;
		int leftPreE = leftInE - leftInS + leftPreS;
		int rightInS = rootIndex + 1;
		int rightInE = e_in;
		int rightPreS = leftPreE + 1;
		int rightPreE = e_pre;
		root.left = construct_tree(pre, leftPreS, leftPreE, in, leftInS, leftInE);
		root.right = construct_tree(pre, rightPreS, rightPreE, in, rightInS, rightInE);
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
		int in[] = {4,2,5,1,6,3,7};
		int pre[] = {1,2,4,5,3,6,7};
        BinaryTreeNode<Integer> root = construct_tree(pre,0,pre.length-1,in,0,in.length-1);
        printTree(root);
	}

}
