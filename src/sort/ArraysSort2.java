package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysSort2 {
public static void main(String[] args) {
	  //sort primitives array like int array
    int[] intArr = {5,9,1,10};
    Arrays.sort(intArr);
    System.out.println(Arrays.toString(intArr));
    
    //sorting String array
    String[] strArr = {"M", "Z", "B", "A", "E"};
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));
    
    //sorting list of objects of Wrapper classes
    List<String> strList = new ArrayList<String>();
    strList.add("Cow");
    strList.add("Bat");
    strList.add("Apple");
    strList.add("Zebra");
    strList.add("Elephant");
    
    System.out.println("before");
    for(String str: strList)
    	System.out.print(" "+str);

    Collections.sort(strList);
    
    System.out.println("after");
    for(String str: strList)
    	System.out.print(" "+str);
}
}
