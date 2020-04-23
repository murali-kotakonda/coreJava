package ds.collections.arrays;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		String names[] ={"user1","user2","user3","user4","user5","user6","user7"};
		
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("enter the key to search");
		String input = sc.next();
		
		boolean found= false;
		for(String data: names){
			if(data.equals(input)){
				found= true;
				break;
			}
		}
		if(found){
			System.out.println("Search string found");
		}else{
			System.out.println("Search string not found");
		}
	}
}
