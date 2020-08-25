package inherit.abstractEx3;

/**
Multi-level inherit:
--------------------------------------------

 - Can a abstract class extend another abstract class?
   YES
 
 - WorldBank is a abstract class .
   RBI is a abstract class that extends   WorldBank.
   ICICI is a normal class that extends RBI.
 
       WorldBank  (ABSTRACT CLASS)
          |   - createAccount()  [ abstract method]
          |   - getKYC()         [ abstract method]
          |
         RBI   (ABSTRACT CLASS)
          |    
          |     - createPPF()    [ abstract method]
          |
        ICICI ( Normal class)
        
 - Is overriding methods mandatory for RBI class  ?
   NO ( because RBI is a abstract class)
 
 - Is overriding methods mandatory for ICICI class  ?
   YES 
  
 - How many methods are mandatory for Icici to override?
   3  [createAccount()  , getKYC()  ,  createPPF() ]
   
 */
public abstract class WorldBank {
	public abstract void createAccount();
	
	public abstract void getKYC();
}



