package oops.poly;

public class TestData2 {
   	public static void main(String[] args) {
  		
        Data2 cal = new Data2();
       
        //call add funtion by passing two long values
        System.out.println(cal.add(44545454l, 545454545l));
  		  
      //call add funtion by passing two float values
        System.out.println(cal.add(12.76f, 13.66f));
        
          //call add funtion by passing two int values
        System.out.println(cal.add(5, 6));   //calls public long add(long a, long b )
  		  
        
      }
     
}
