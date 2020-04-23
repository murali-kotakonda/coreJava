package filesExs;

import java.io.File;

public class SearchRecur {
	
		public static void main(String[] args) {
			//search("initrd.img");
			//searchHelper("/home/td/Desktop/Java", "flower.odt");
			searchHelper("/home", "flower.odt");
			//search("flower.odt");
			
		}
		
		public static void search(String name) {
			try {
			File f3 = new File(name);
			File[] fr = f3.listRoots();
			for(File f : fr) {
				//searchhelper() take a directory name and a file name
				searchHelper(f.toString(), name);
			}
			}catch(Exception e) {
				System.out.println("program crashed");
			}
		}
		
		
		
		public static void searchHelper(String dir, String name) {
			File f2 = new File(dir);
			File f3 = new File(name);
		boolean found = false;
			//list all the files and directories with their full path
			for(File n: f2.listFiles()) {
			//	System.out.println(n);
				//n is file so we need to call toString() to make it a string to compare with
				//file name
				if(n.isFile() && n.toString().contains(name)) {
					System.out.println("found in " + n.toString());
					found = true;
				}
				else if(n.isDirectory()) {
					searchHelper(n.toString(), name);
				}				
			}
			if(!found){
				//System.out.println("not found");
			}
			
		}
}

