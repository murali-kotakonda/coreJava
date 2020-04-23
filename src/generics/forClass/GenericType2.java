package generics.forClass;

class GenericType2<T, U>
{
    T data1;  // An object of type T
    U data2;  // An object of type U
 
    // constructor
    GenericType2(T obj1, U obj2)
    {
        this.data1 = obj1;
        this.data2 = obj2;
    }
 
    // To print objects of T and U
    public void print()
    {
        System.out.println(data1);
        System.out.println(data2);
    }
}
 
class Main
{
    public static void main (String[] args)
    {
    	GenericType2 <String, Integer> obj =
            new GenericType2<String, Integer>("GfG", 15);
        obj.print();
    }
}