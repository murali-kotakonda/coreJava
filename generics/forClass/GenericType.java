package generics.forClass;
 
public class GenericType<E> {

	private E data;
	
	public E get(){
		return this.data;
	}
	
	public void set(E t1){
		this.data=t1;
	}
}