//2236. Root Equals Sum of Children

package sample;

class TreeEquals {
	int val;
	TreeEquals left;
	TreeEquals right;

	TreeEquals(int x) {
		val = x;
	}
}

public class RootEqualsSumOfChildren {
	public boolean evaluateEquals(TreeEquals root) {

		TreeEquals node1 = root.left;
		TreeEquals node2 = root.right;
		if (root.val == (node1.val + node2.val)) {
			return true;

		}

		return false;
	}

	public static void main(String[] args) {
		TreeEquals root = new TreeEquals(10);
		root.left = new TreeEquals(4);
		root.right = new TreeEquals(6);

		RootEqualsSumOfChildren obj = new RootEqualsSumOfChildren();
		boolean result = obj.evaluateEquals(root);
		System.out.println("Evaluate Boolean binary tree: " + result);
	}

}
