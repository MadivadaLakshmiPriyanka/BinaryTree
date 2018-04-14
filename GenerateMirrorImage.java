
public class GenerateMirrorImage {

	protected void Image(Node node) {
        //Function to create an image of passed tree (pass the root)
        if (node != null) { 
        Image(node.left); 
        Image(node.right);
        Node temp = node.left; 
        node.left = node.right; 
        node.right = temp; 
        }
    }
}
