package encapsulation;

public class AbstractionClass extends DataHidingClass{

	public static void main(String[] args) {
		
		AbstractionClass a = new AbstractionClass();
		System.out.println(a.getbalance());
		
	}
}
//Encapsulation:

//Encapsulation is just to bind the data and make it available through hiding the
//internal functionality to the end user.

//Encapsulation == Data hiding + Abstraction

//Encapsulation can be achieved by declaring a variable as private inside a class which
//is used by a public method. Later that method will be called by other classes.

//So here declaring variable as private is data hiding and calling the public method to
//the other classes which is showing only the functionality but not the implementation
//is Abstraction.

//OOPS concept have 3 pillers --- Inheritance, Polymorphism and Encapsulation

//Inheritance provides re-usability 
//Polymorphism provides flexibility
//Encapsulation provides security
