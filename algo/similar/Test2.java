package similar;


/**
 thou (th)
inch (in) 1000 thous
foot (ft) 12 inches
yard (yd) 3 feet
chain (ch) 22 yards
furlong (fur) 10 chains
mile (mi) 8 furlongs
league (lea) 3 miles
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//42 ft in inch
		//504 inch in ft
		String input = sc.nextLine();
		Map<String,String> cases= new HashMap<String, String>();
		cases.put("inch","in");
		cases.put("foot","ft");
		cases.put("yard","yd");
		cases.put("chain","ch");
		cases.put("furlong","fur");
		cases.put("mile","mi");
		cases.put("league","lea");
		cases.put("thou","th");
		
		int []values = {3,8,10,22,3,12,1000};
		Map<String,Integer> cases3= new LinkedHashMap<>();
		cases3.put("lea",1);
		cases3.put("mi",2);
		cases3.put("fur",3);
		cases3.put("ch",4);
		cases3.put("yd",5);
		cases3.put("ft",6);
		cases3.put("in",7);
		cases3.put("th",8);
		
		String inputs[] =input.split("\\s+");
		
		int measure = Integer.parseInt(inputs[0]);
		String from = cases.getOrDefault(inputs[1], inputs[1]);
		String to = cases.getOrDefault(inputs[3], inputs[3]);
			int fromPosi = cases3.get(from);
			int toPosi = cases3.get(to);
			if(toPosi>fromPosi) {
				int pro= 1;
				//multiply
				for(int i= fromPosi-1;i<toPosi-1;i ++) {
					pro = pro * values[i];
				}
				pro = measure * pro;
				System.out.println(pro);
			}
			else {
				//divide
				double pro= 1;
				for(int i= toPosi-1 ;i<fromPosi-1;i ++) {
					pro = pro * values[i];
				}
				pro = measure/ pro;
				
				String s = ""+pro;
				if(s.endsWith(".0")) {
					System.out.println(s.substring(0,s.length()-2));
				}else {
					System.out.println(pro);
				}
				
			}
	}

}
