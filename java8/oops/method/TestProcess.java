package oops.method;

public class TestProcess {

	public static void main(String[] args) {
		//create obj 
		
		Process p = new Process();
		
		// call method usng obj
		String v = p.getData();
		System.out.println(v);
		
		String v1 = p.getData1("kumar");
		System.out.println(v1);
		
		String v2 = p.getData1("shyam");
		System.out.println(v2);
		
		
		int res = p.sum(10, 20);
		System.out.println("sum = "+res);
		
		int res1 = p.sum(50, 30);
		System.out.println("sum = "+res1);
		
		res = p.big(10, 20);
		System.out.println("big = "+res);
		
		res1 = p.big(50, 30);
		System.out.println("big = "+res1);
		
		res = p.small(10, 20);
		System.out.println("small = "+res);
		
		res1 = p.small(50, 30);
		System.out.println("small = "+res1);
		
	}
	//  main()    ---- input args------->     getData()
	//            <-----return statement----           
	
}
