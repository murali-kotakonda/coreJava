package ds;

public class DeleteLinkedList {

	  Node head;

	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}
	
	// prints content of double linked list
	 public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data+" ");
	            tnode = tnode.next;
	        }
	    }

	// Driver Code
	 public static void main(String[] args)
	    {
	        /* Start with the empty list */
		   DeleteLinkedList llist = new DeleteLinkedList();
	 
	        llist.push(7);
	        llist.push(1);
	        llist.push(3);
	        llist.push(2);
	        llist.push(8);
	 
	        System.out.println("\nCreated Linked list is: ");
	        llist.printList();
	 
	        llist.deleteNode(4);  // Delete node at position 4
	 
	        System.out.println("\nLinked List after Deletion at position 4: ");
	        llist.printList();
	    }

	private void deleteNode(int i) {
		int count =0;
		Node node =head;
		Node prev =null;
		while (node != null) {
			if(i==count) {
				//delete node
				prev.next =node.next;
						node.next =null	;	
				break;
			}
			prev = node;
			node = node.next;
			count++;
		}
	}
}
