package accessmodifier;

public final class ParentClassLevelAM {//AM=access modifier

	public void m1() {
		
		System.out.println("no argument method from parent class level AM ");
	}
	
	public ParentClassLevelAM() {
		
		System.out.println("Constructor from parent class level AM");
		
	}
}
//Defination: The keyword which tells the accessibility of a particular method, variable or class.
//1. Access Modifier applicable to class:

//i. public : - It can be accessible throughout the project.

//ii. final : - Whichever class declared as final it cannot follow inheritance
//i.e the class which has declared as final cannot be extended by another class.

