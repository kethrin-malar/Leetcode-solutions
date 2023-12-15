package sample;

class Tree {
	int val;
	Tree left;
	Tree right;

	Tree(int x) {
		val = x;
	}
}

public class Booleanbinarytree {
	public boolean evaluateTree(Tree root) {
		if (root == null) {
			return false; 
		}

		if (root.left == null && root.right == null) {
			return root.val == 1;
		}

		boolean leftSide = evaluateTree(root.left);
		boolean rightSide = evaluateTree(root.right);

		if (root.val == 3) {
			return leftSide && rightSide;
		} else if (root.val == 2) {
			return leftSide || rightSide;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Tree root = new Tree(3);
		root.left = new Tree(3);
		root.right = new Tree(2);
		root.left.left = new Tree(1);
		root.left.right = new Tree(1);
		root.right.right = new Tree(1);
		root.right.left = new Tree(0);

		Booleanbinarytree evaluator = new Booleanbinarytree();
		boolean result = evaluator.evaluateTree(root);
		System.out.println("Evaluate Boolean binary tree: " + result);
	}
}
