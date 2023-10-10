/**
 * Depth First Search class.
 * 
 * @author lhamilton2
 */
class DepthFirstSearch
{
    private int nodeCount;

    public DepthFirstSearch() 
    {
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }

    /**
     * Performs DFS on the tree in a recursive preorder manner.
     *
     * @param node The current node
     */
    public void DFS(Node node) 
    {
        if (node != null) 
        {
            // Print the value of the node
            System.out.println("Node value: " + node.getData());

            // Increment the node count
            nodeCount++;

            // Two recursive calls to left and right children
            DFS(node.getlChild());
            DFS(node.getrChild());
        }
    }

    /**
     * Gets the number of nodes traversed.
     *
     * @return The number of nodes traversed
     */
    public int getNodeCount() 
    {
        return nodeCount;
    }
}