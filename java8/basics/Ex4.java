package basics;

public class Ex4 {

	public static void main(String[] args) {
		//arithmetic operations
		int a= 60;
		int b = 20;
		
	    int sum  = a+b;
	    int sub =a-b;
	    int mul = a*b;
	    int div = a/b;
	    int mod = a%b;
	    
	    System.out.println(sum);
	    System.out.println(sub);
	    System.out.println(mul);
	    System.out.println(div);
	    System.out.println(mod);
	    
	    
	    //assignment
	    int z= a; // assign the valu of a to z
	    System.out.println("z="+z);
	    
	    
	    //incrementor , decrementor
	    int x= 90;
	    
	    x++; //x = x+1 post increment
	    ++x; //x = x+1 pre increment
	    
	    System.out.println(x++);
	    System.out.println(++x);
	    
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //assignment
	    x = x+5; // or x+= 5;
	    x = x-5; // or x-= 5;
	    x = x*5; // or x*= 5;
	    x = x/5; // or x/= 5;
	    
	    //bitwise operators &,|,~ ,^ , << , >>	    
        int v1= 5;  //     0101   
        int v2=1;   //     0001
        
        System.out.println(v1&v2);  // bit value will be 1 if both bits are 1 [ 0001 ]
        System.out.println(v1|v2); // bit value will be 1 if any bit is 1 [ 0101 ]
        int v3= ~v2;
        System.out.println(v3);    // 0101   ----> 1010  
	    		
	    
	    
	    
	    
	}
}
