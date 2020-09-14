

package innerEx;


/**
 
-> class should be inside the method
-> object creation inside the same method
-? class/obj cannot be accessed outside the method.
->local inner class can access instance variabkes/static variables of class.


Syntax:
---------------------------------------
public class Outer {

   //method start
   public void m1(){
   
        //inner class start
        class Inner {
            
              //inner method start
              public void m2(){
              
              }
              //inner method end
        }
        //inner class end
   
       
       //create inner obj
       Inner   i = new Inner();
       i.m2();
         
   }
   //method end
   
} //class end

In  m1() we created the class Inner and also the object for Inner.

 */
public class LocalInner {

	public void display() {
		
    //inner clas start
		class Local {
			void msg() {
				System.out.println("helloo");
			}
		}
		//inner clas end
    
		Local l = new Local();
		l.msg();
	}

}
