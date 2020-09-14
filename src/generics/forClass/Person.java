package generics.forClass;
 
public class Person<T> {

	private T data;
	
	public T get(){
		return this.data;
	}
	
	public void set(T t1){
		this.data=t1;
	}
}