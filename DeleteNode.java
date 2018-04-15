
public class DeleteNode {

	static Node deleteRec(Node root, int key) {
		System.out.println("key" + key);

		/* Base Case: If the tree is empty */
		if (root == null)
			return root;
		

		/* Otherwise, recur down the tree */
		if (key < root.data)
			root.left = deleteRec(root.left, key);

		else if (key > root.data)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
		/*	if (root.left != null && root.right != null) {
				Node temp = root;
				// Finding minimum element from right
				 int minValue = minValue(temp.right);
				// Replacing current node with minimum node from right subtree
				root.data = minValue;
				// Deleting minimum node from right now
				root =deleteRec(root.right, minValue);
 
			}
			// if nodeToBeDeleted has only left child
			else if (root.left != null) {
				root = root.left;
			}
			// if nodeToBeDeleted has only right child
			else if (root.right != null) {
				root = root.right;
			}
			// if nodeToBeDeleted do not have child (Leaf node)
			else
				root = null;*/
			
			
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.data = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.data);
		}

		
		return root;
	}

	static int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}

}
