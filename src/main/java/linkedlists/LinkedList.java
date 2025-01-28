package linkedlists;

/** A class representing a singly linked list. */
public class LinkedList {
	private Node head, tail;

	/** Constructor */
	public LinkedList() {
		head = null;
		tail = null;
	}

	/**
	 * Creates a new node with the given element and adds it to the back of the
	 * list
	 */
	public void append(int elem) {
		Node newNode = new Node(elem);
		// FILL IN CODE
	}

	/**
	 * Insert a new node with the given element in front of the linked list
	 * @param elem element
	 */
	public void insertAtFront(int elem) {
		// FILL IN CODE:
		// Insert a new node with elem in front of the linked list

	}


	/** Prints all the nodes in the link list */
	public void printNodes() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getElem() + " ");
			current = current.next();
		}
		System.out.println();
	}

	/**
	 * Insert a new node with the given element at index i
	 * @param i index
	 * @param elem element
	 */
	public void insertAtIndex(int i, int elem) {
		// FILL IN CODE: insert a new node with the given elem
		// at "index" i
		// Example:
		// If the linked list is 5 -> 7 - > 2 and we call
		// insertAtIndex(1, 8), the linked list will be
		// 5 -> 8 -> 7 -> 2  we inserted element 8 at "index" = 1.
	}

	/**
	 * Returns a reference to the middle node
	 * @return reference to the middle node
	 */
	public Node getMiddleNode() {
	 // FILL IN CODE: use slow and fast points to return
	 // the node in the middle of the linked list in one pass

	 return null;

	}

	/**
	 * Remove the node with the given element
	 * @param elem element
	 */
	public void removeNode(int elem) {
		// FILL IN CODE: remove the first node it finds with the given element
	}
}
