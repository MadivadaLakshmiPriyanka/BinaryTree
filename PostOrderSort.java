
public class PostOrderSort {
	 public void PostOrder(Node root)  {
	        //Function to perform the postoder traversal of a binary tree
	        if(root != null)
	        {
	            PostOrder(root.left);
	            PostOrder(root.right);
	          LaunchApplication.pOrder += root.data + " ";
	        }        
	    }

}
