/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		
		//DFS
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		
		 // Print nodes traversed and height of tree
        System.out.println("\nNumber of nodes traversed: " + aSearch.getNodeCount());
        System.out.println("Height of the tree: " + calculateHeight(root));

	}	
		
	
	
	/**
	     * Calculates the height of the tree.
	     *
	     * @param node The root node of the tree
	     * @return The height of the tree
	     */
	    private static int calculateHeight(Node node) 
	    {
	        if (node == null)
	        {
	            return 0;
	        } else 
	        {
	            int leftHeight = calculateHeight(node.getlChild());
	            int rightHeight = calculateHeight(node.getrChild());
	            return 1 + Math.max(leftHeight, rightHeight);
	        }
	    }
}	
	