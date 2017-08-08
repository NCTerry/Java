/*

 */
package binarytree;

/**
 *
 * @author Tracksta6
 */
// ==================================================================

public class Node {
    
    	int key;
	String name;

	Node leftChild;
	Node rightChild;

        // Create the constructor
	Node(int key, String name) {

		this.key = key;
		this.name = name;
	}
// ==================================================================
        // Useful return value for a node
	public String toString() {

		return name + " has the key " + key;
        /*
         * return name + " has the key " + key + "\nLeft Child: " + leftChild +
         * "\nRight Child: " + rightChild + "\n";
         */
	}
}
// ==================================================================
