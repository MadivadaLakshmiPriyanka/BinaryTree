
public class SearchLeafNode {

	
	  public  void leafNodes(Node node) {
	         // leafnode=lastnode
	        //Function to compute the leaf nodes in a Binary Tree
	        if(node != null && node.left == null && node.right == null) {
	           LaunchApplication. lNodes += node.data + " ";
	        }
	        if(node.right != null) {
	            leafNodes(node.right);
	        }
	        if(node.left != null) {
	            leafNodes(node.left);
	        }
	    }
}
