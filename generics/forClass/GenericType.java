package generics.forClass;
 
public class GenericType<E> {

	private E t;
	
	public E get(){
		return this.t;
	}
	
	public void set(E t1){
		this.t=t1;
	}
}