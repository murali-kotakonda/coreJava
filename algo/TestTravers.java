import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class Tree{
	
	int data;
	Tree left;
	Tree right;
}
public class TestTravers {
	public static void main(String[] args) {
		Tree root = null;
		
	}
	
	
	/**
	 10
    5        30
  3   6    15    31

	 */
	public void travsers(Tree root) {
		
		Tree cur = root;
		// hashmap , stack , queue
		
		// hashmap
		// 10 -> 5 ,30
		// 5  -> 3 , 6
		// 30 ->  15 , 31
		// 3 -> null
		// 6  -> null
		// 15  -> null
		// 31 -> null 
		
		//  queue
		//10 , 5 , 30 ,3,6, 15, 31
		Queue<Tree> myqueue = new LinkedBlockingQueue();
		myqueue.add(cur);
		int level = 1;
		// 1 , 
		while(!myqueue.isEmpty()) {
			
			Tree procss =myqueue.poll();
			
			System.out.print(procss.data + " " + " : " );
			
			if(procss.left!=null) {
				myqueue.add(procss.left);
			}
			
			if(procss.right!=null) {
				myqueue.add(procss.right);
			}
			
		}
		
	}
	
}
