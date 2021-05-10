package interfaceconcept;

public interface Interface1 {

	int i = 10;
	
	 void m1();
	
	 void m2();
	 //here m1 and m2 method are by default public and abstract .
}


//Interface:
//Interface contains 100% abstract methods if we try to define a method with body,
//then it will be an error. Whenever we are not sure about the complete logic for 
//any of the functionality then we should declare the particular class as Interface.


//NOTE:
//	All the methods present inside an interface are by default public and abstract 
//	whether we are declaring or not.
