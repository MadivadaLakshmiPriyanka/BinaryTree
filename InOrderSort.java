
public class InOrderSort {
	// String iOrder;  
	 public void InOrder(Node root)  {
	        //Function to perform the inorder traversal of a binary tree
	        if(root != null)
	        {   InOrder(root.left);
	            LaunchApplication.iOrder += root.data + " ";
	            InOrder(root.right);
	        }
	    }
	    
}
