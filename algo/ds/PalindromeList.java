package ds;

import java.util.Stack;

public class PalindromeList {

	static Node head;
	
	// 1st reverse and then compare
	 static boolean isPalindrome(Node head)
	    {
	        Node slow = head;
	        boolean ispalin = true;
	        Stack<Integer> stack = new Stack<Integer>();
	 
	        while (slow != null) {
	            stack.push(slow.data);
	            slow = slow.next;
	        }
	 
	        while (head != null) {
	            int i = stack.pop();
	            if (head.data == i) {
	                ispalin = true;
	            }
	            else {
	                ispalin = false;
	                break;
	            }
	            head = head.next;
	        }
	        return ispalin;
	    }
	

	 void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args) {
		PalindromeList list = new PalindromeList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(1);

		System.out.println("Given Linked list");
		list.printList(head);
		System.out.println(isPalindrome(head));
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
