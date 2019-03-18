package other;

 

/*public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
*/
  class Person2 {

    private static Person2 obj;
    
    private Person2(){}
    
    public static Person2 getInstance(){
        if(obj == null){
            obj = new Person2();
        }
        return obj;
    }
}
