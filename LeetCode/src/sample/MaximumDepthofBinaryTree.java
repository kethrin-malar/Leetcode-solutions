package sample;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        //root.right.left.left = new TreeNode(11);
        

        MaximumDepthofBinaryTree solution = new MaximumDepthofBinaryTree();
        int depth = solution.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}
	