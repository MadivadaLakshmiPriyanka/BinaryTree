
public class PreOrderSort {
    public void PreOrder(Node root)  {
        //Function to perform the preorder traversal of a binary tree
        if(root != null)
        {           
           LaunchApplication.prOrder += root.data + " ";
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

}
