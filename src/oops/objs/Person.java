package oops.objs;
public class Person {
	
	int id;
	String name;
	int age;
	
	 public void show(){
		  // logic here 
	 }
}
// Here id,name,age are instance variables.
// show() is a method


/*

Class:
-----
-> Class is a user defined data type
->Class is a blue print for object creation
-> class is a template, defines structure.
-> class is a logical memory , but not physical memory
-> class represents the real time entity. 
For every entity we need to create class
  ex: Company, Department , Project , Employee , Address
-> Class determines how an obj will behave and what the object will contain.

 -> Userdefined datatype
-> Class is used to represent the real time entities/structure/model.
-> class is created before run- time
->class is a logical representation 
->class is a template 
-> class doesnt contain any data.

  
-> Class is  block for instance varibles + functions
    a)insatance variables to hold data for entity
    b)funtions would operate on instance varibles  

-> Class has 
       Instance variables + methods
       constructors
       Static variables + static methods + static block


Object:
------------
-> Object is a variable created using Class
-> Object is a instance for the class.
-> when object is created memory is allocated for all the instance variables.
syntax:


Person p = new Person();
Obj is created in heap memory
-> Every obj has state(instance variables) and behavior(methods) 
-> Object has physical memory 
->Object has the real time data

Person p = new Person()
  p has memory for id, name , age

use "." operator on the object to access anthing from the class

Set Data:
----------
p.id =4000
p.name ="user1"
p.age=56
  


Acces data:
-------------
print(p.id)
print(p.name)
print(p.age)


call the funtion:
------------------
p.show()

  
 
*/