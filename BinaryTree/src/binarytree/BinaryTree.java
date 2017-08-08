
package binarytree;

/**
 *
 * Remember, that unbalanced trees even if they work, are slow.
 * Basic time = O(long(n))
 * @author Tracksta6
 */
// ==================================================================
public class BinaryTree {
    // Every tree will have a root value.
    Node root;
    
// ==================================================================
    public void addNode(int key, String name) {

        // Create a new Node and initialize it
        Node newNode = new Node(key, name);

        // If there is no root this becomes root
        if (root == null) {

                root = newNode;

        } else {
            // Set root as the Node we will start
            // with as we traverse the tree
            Node focusNode = root;

            // Future parent for our new Node
            Node parent;

            // Infinite loop that we must jump out of.
            while (true) {

                // root is the top parent so we start
                // there
                parent = focusNode;

                // Check if the new node should go on
                // the left side of the parent node
                if (key < focusNode.key) {

                    // Switch focus to the left child
                    focusNode = focusNode.leftChild;

                    // If the left child has no children
                    if (focusNode == null) {

                        // then place the new node on the left of it
                        parent.leftChild = newNode;
                        return; // All Done

                    }

                } else { // If we get here put the node on the right

                    focusNode = focusNode.rightChild;

                    // If the right child has no children
                    if (focusNode == null) {

                        // then place the new node on the right of it
                        parent.rightChild = newNode;
                        return; // All Done
                    }
                }
            }
        }
    }

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth
// ==================================================================
    public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            // Traverse the left node
            inOrderTraverseTree(focusNode.leftChild);

            // Visit the currently focused on node
            System.out.println(focusNode);

            // Traverse the right node
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
// ==================================================================
    /*
    Pre-Order --> Go all the way down the left side until you hit null
        Then jump up 1 parent, and go down right child.
        Binary only has 2 children so repeat with new node.
        Once you hit the root, you travel all the way down the right
    */
    public void preorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            System.out.println(focusNode);

            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);

        }
    }
// ==================================================================
    public void postOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }
// ==================================================================
    public Node findNode(int key) {

        // Start at the top of the tree
        Node focusNode = root;

        // While we haven't found the Node
        // keep looking
        while (focusNode.key != key) {

            // If we should search to the left
            if (key < focusNode.key) {
                
                // Shift the focus Node to the left child
                focusNode = focusNode.leftChild;

            } else {
                // Shift the focus Node to the right child
                focusNode = focusNode.rightChild;
            }

            // The node wasn't found
            if (focusNode == null)
                return null;
        }
        
        return focusNode;
    }
// ==================================================================
    public boolean remove(int key) {
                            /*
                            50
        
                    25              75
        
             15         30              85
        
          2     18
        
        Delete the root? If 50 is the root, we take the right child and replace.
            Then assign the left child of 50 as the left child of 75
        Delete 25
            If 25 < 50 && 25 has a right child
                Replace 25 with its right child 30.
                   Set 50 left child to 30
                   Set 30 left child to 15
        Note if 30 has children   27   33
            30 still replaces 25
            15 becomes left child of 27
                
                    */

            // Start at the top of the tree with both
            Node focusNode = root;
            Node parent = root;

            // When searching for a Node this will
            // tell us whether to search to the
            // right or left
            boolean isItALeftChild = true;

            // While we haven't found the Node
            // keep looking
            while (focusNode.key != key) {

                parent = focusNode;

                // If we should search to the left
                if (key < focusNode.key) {

                    isItALeftChild = true;

                    // Shift the focus Node to the left child
                    focusNode = focusNode.leftChild;

                } else {
                    // Greater than focus node so go to the right
                    isItALeftChild = false;

                    // Shift the focus Node to the right child
                    focusNode = focusNode.rightChild;
                }

                // The node wasn't found
                if (focusNode == null)
                    return false;
            }

            // If Node doesn't have children delete it
            if (focusNode.leftChild == null && focusNode.rightChild == null) {
                
                // If root delete it
                if (focusNode == root)
                    root = null;

                // If it was marked as a left child
                // of the parent delete it in its parent
                else if (isItALeftChild)
                    parent.leftChild = null;

                // Vice versa for the right child
                else
                    parent.rightChild = null;
            }

            // If no right child
            else if (focusNode.rightChild == null) {

                if (focusNode == root)
                    root = focusNode.leftChild;

                // If focus Node was on the left of parent
                // move the focus Nodes left child up to the
                // parent node
                else if (isItALeftChild)
                    parent.leftChild = focusNode.leftChild;

                // Vice versa for the right child
                else
                    parent.rightChild = focusNode.leftChild;

            }

            // If no left child
            else if (focusNode.leftChild == null) {

                if (focusNode == root)
                    root = focusNode.rightChild;

                // If focus Node was on the left of parent
                // move the focus Nodes right child up to the
                // parent node
                else if (isItALeftChild)
                    parent.leftChild = focusNode.rightChild;

                // Vice versa for the left child
                else
                    parent.rightChild = focusNode.rightChild;

            }

            // Two children so I need to find the deleted nodes
            // replacement
            else {

                Node replacement = getReplacementNode(focusNode);

                // If the focusNode is root replace root
                // with the replacement
                if (focusNode == root)
                        root = replacement;

                // If the deleted node was a left child
                // make the replacement the left child
                else if (isItALeftChild)
                        parent.leftChild = replacement;

                // Vice versa if it was a right child
                else
                        parent.rightChild = replacement;

                replacement.leftChild = focusNode.leftChild;
            }

            return true;
	}
// ==================================================================
    public Node getReplacementNode(Node replacedNode) {

		Node replacementParent = replacedNode;
		Node replacement = replacedNode;

		Node focusNode = replacedNode.rightChild;

		// While there are no more left children

		while (focusNode != null) {

			replacementParent = replacement;

			replacement = focusNode;

			focusNode = focusNode.leftChild;

		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild

		if (replacement != replacedNode.rightChild) {

			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = replacedNode.rightChild;

		}

		return replacement;

	}
// ==================================================================
    public static void main(String[] args) {

                    BinaryTree theTree = new BinaryTree();

                    theTree.addNode(50, "Boss");
                    theTree.addNode(25, "Vice President");
                    theTree.addNode(15, "Office Manager");
                    theTree.addNode(30, "Secretary");
                    theTree.addNode(75, "Sales Manager");
                    theTree.addNode(85, "Salesman 1");
                    
                    /*
                                    50
                                25          75
                             15     30          85
                    */

                    // Different ways to traverse binary trees
                    System.out.println("\n1)");
                    theTree.inOrderTraverseTree(theTree.root);

                    System.out.println("\n2)");
                    theTree.preorderTraverseTree(theTree.root);

                    System.out.println("\n3)");
                    theTree.postOrderTraverseTree(theTree.root);

                    // Find the node with key 75
                    System.out.println("\nNode with the key 75");
                    System.out.println(theTree.findNode(75));
                    
                    // Find the node with key 75
                    System.out.println("\nNode with the key 25");
                    System.out.println(theTree.findNode(25));
                    
                    // Remove the node with key 25
                    System.out.println("Remove Key 25");
                    theTree.remove(25);
                    
                    // Find the node with key 75
                    System.out.println("\nNode with the key 25");
                    System.out.println(theTree.findNode(25));

    }
}

