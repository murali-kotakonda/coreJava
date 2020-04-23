package ds.collections.stackAndQueue;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();

	stack.push("user1");
	stack.push("user2");
	stack.push("user3");
	stack.push("user4");
		
	printTop(stack);
	
	String removedElement = stack.pop();
	System.out.println("removed = "+removedElement);

	printTop(stack);
}

private static void printTop(Stack<String> stack) {
	String curr = stack.peek();
	System.out.println(curr);
}

}
