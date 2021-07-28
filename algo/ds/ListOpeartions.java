package ds;

import java.util.HashSet;

public class ListOpeartions {

	static Node head;

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		Node current = node;
		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;

			prev = current;
			current = next;

		}
		node = prev;
		return node;
	}

	int getCount(Node  head)
	{
	    // Base Case
	    if (head == null) {
	        return 0;
	    }
	    // Count this node plus the rest of the list
	    else {
	        return 1 + getCount(head.next);
	    }
	}
	 static void removeDuplicate(Node head)
	    {
	        // Hash to store seen values
	        HashSet<Integer> hs = new HashSet<>();
	     
	        /* Pick elements one by one */
	        Node current = head;
	        Node prev = null;
	        while (current != null)
	        {
	            int curval = current.data;
	             
	             // If current value is seen before
	            if (hs.contains(curval)) {
	                prev.next = current.next;
	            } else {
	                hs.add(curval);
	                prev = current;
	            }
	            current = current.next;
	        }
	    }
	 
	 public boolean search(Node head, int x)
	    {
	        // Base case
	        if (head == null)
	            return false;
	 
	        // If key is present in current node,
	        // return true
	        if (head.data == x)
	            return true;
	 
	        // Recur for remaining list
	        return search(head.next, x);
	    }
	 
	 void printMiddle(Node head)
	 {
	     int count = 0;
	     Node mid = head;
	  
	     while (head != null)
	     {
	  
	         // Update mid, when 'count'
	         // is odd number
	         if ((count % 2) == 1)
	             mid = mid.next;
	  
	         ++count;
	         head = head.next;
	     }
	  
	     // If empty list is provided
	     if (mid != null)
	         System.out.println("The middle element is [" +
	                             mid.data + "]\n");
	 }
	
	static Node reverse1(Node head) {
		if (head == null || head.next == null)
			return head;

		/*
		 * reverse the rest list and put the first element at the end
		 */
		Node rest = reverse1(head.next);
		head.next.next = head;

		/* tricky step -- see the diagram */
		head.next = null;

		/* fix the head pointer */
		return rest;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args) {
		ListOpeartions list = new ListOpeartions();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
