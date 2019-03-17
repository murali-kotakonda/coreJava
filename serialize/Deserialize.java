package serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Deserialize{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("obj1.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);
  System.out.println(s.refNo); 
  
  in.close();  
 }  
}  