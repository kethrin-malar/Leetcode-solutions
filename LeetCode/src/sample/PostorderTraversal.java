package sample;

import java.util.ArrayList;
import java.util.List;

class BinaryTree {
	int val;
	BinaryTree left;
	BinaryTree right;

	BinaryTree(int x) {
		val = x;
	}
}

public class PostorderTraversal {
	ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> postorder(BinaryTree root) {
    	
        if (root!=null) {
            postorder(root.left);
            postorder(root.right);
            list.add(root.val);
        }
        return list;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree(3);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(5);
		
		PostorderTraversal evaluator = new PostorderTraversal();
		List result = evaluator.postorder(root);
		System.out.println("Evaluate PostOrder binary tree: " + result);

	}

}
