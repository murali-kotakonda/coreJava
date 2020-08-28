package ds.collections.arrays;

import java.util.Scanner;

/**
  search by content.
  
  -> search by content  is slow in arrays, because array requires linear search.
  
  Case#1: an array has 500 elements and assume "delhi" does not exists inside the array
  search "delhi" inside the array [search by content]
 
  -How many searches will it takes?
   500 (liner search)  
  
  Case#2: an array has 500 elements and assume "delhi" exists inside the array at 400 position.
  search "delhi" inside the array [search by content]
 
  -How many searches will it takes?
   400 (liner search)  
    
  Case#3: an array has 500 elements 
  Get the element at 400 position [search by position]
 
  -How many searches will it takes?
   1 [ search by position is fast ] 
  
  
 search by content.
 check if  the given element is available in the array or not.
 
 
 */
public class ArraySearch {
	public static void main(String[] args) {
		//source array
		String names[] ={"user1","user2","user3","user4","user5","user6","user7"};
		
		//take input to search
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key to search");
		String search = sc.next();
		
		//compare input with every element inside the array
		boolean found = false;
		
		for( String name: names) {
			if(search .equals(name)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(search + " is   available .");
		}else {
			System.out.println(search + " is  not available. ");
		}
		
	}
}
