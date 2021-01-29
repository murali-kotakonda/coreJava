package ds.collections.HashMapEx2;

public class ConcurrentEx {
/*  
 
 
 HashTable vs HashMap:
-------------------------


HashTable:
- is thread safe
- can be used in multi threading
- is syncronized
- all methods in hashtable are syncronized
- entire code is locked , at a time only one thread can alter the hashtable 

HashMap:
- is not thread safe
- cannot  be used in multi threading
- is not  syncronized

ConcurrentHashMap:
-----------------------
- is thread safe
- can be used in multi threading
- is syncronized
- Performance is better when compared with HashTable
- DEFAULT_CONCURRENCY_LEVEL = 16
the Object is divided into 16 number of segments 
- the internal data structure used is Segment 
- allows concurrent threads to read the value without locking the entire code.
-Read:
At a time any number of threads can do  read operation 
without locking the map.
- Write:
the thread must lock the particular segment in which the thread wants to operate. 
at a time, 16 update operations can be performed by threads.
This type of locking mechanism is known as Segment locking or bucket locking.







 While one thread is Iterating the HashMap object, 
 if other thread try to add/modify the contents of Object then 
 we will get Run-time exception saying ConcurrentModificationException.
 Whereas In ConcurrentHashMap we wont get any exception while performing
  any modification at the time of Iteration.
 
 
 - Part of the map called Segment (internal data structure) is only getting locked while 
 adding or updating the map. 
 So ConcurrentHashMap allows concurrent threads to read the value without locking at all.
 
  
- A ConcurrentHashMap has internal final class called Segment 
so we can say that ConcurrentHashMap is internally divided in segments of size 32, 
so at max 32 threads can work at a time. 
It means each thread can work on a each segment during high concurrency 
and atmost 32 threads can operate at max which simply maintains 
32 locks to guard each bucket of the ConcurrentHashMap.
  
  
This data structure was introduced to improve performance.
 
 Key points of ConcurrentHashMap:  

The underlined data structure for ConcurrentHashMap is Hashtable.
- ConcurrentHashMap class is thread-safe i.e. 
-multiple threads can operate on a single object without any complications.
-At a time any number of threads are applicable for a read operation 
without locking the ConcurrentHashMap object which is not there in HashMap.
-In ConcurrentHashMap, the Object is divided into a number of segments 
according to the concurrency level.
-The default concurrency-level of ConcurrentHashMap is 16.
-In ConcurrentHashMap, at a time any number of threads can perform retrieval operation 
but for updation in the object, the thread must lock the particular segment 
in which the thread wants to operate. 
This type of locking mechanism is known as Segment locking or bucket locking. 
Hence at a time, 16 update operations can be performed by threads.
Inserting null objects is not possible in ConcurrentHashMap as key or value.
 *  */
	
	public static void main(String[] args) {
		
	}
}
