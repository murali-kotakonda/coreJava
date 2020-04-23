package ds.collections.stackAndQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("user1");
		queue.add("user2");
		queue.add("user3");
		queue.add("user4");
			
		System.out.println("top="+queue.peek());
		
		System.out.println("removed="+queue.poll());
		System.out.println("top="+queue.peek());
		
		System.out.println("removed="+queue.poll());
		System.out.println("top="+queue.peek());
	}
}
