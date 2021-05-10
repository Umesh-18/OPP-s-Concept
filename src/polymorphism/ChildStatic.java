package polymorphism;

public class ChildStatic extends ParentStatic {

	public static void v() {
		
	System.out.println("Child v method");
	
}
	
	public static void main(String[] args) {
		
		ParentStatic p = new ParentStatic();
		p.v();//Parent's static method will get execute

		v();// Child static method will get execute

		
		ChildStatic c = new ChildStatic();
		c.v();// Child static method will get execute

		
		ParentStatic pp = new ChildStatic();
		pp.v();//Parent's static method will get execute
		

		
	}
}
//Overriding with respect to Static methods:

//We cant override a static method as non static or either way after doing the same we will get compile time error.

//Reason: To access static we don’t need an object and for non-static we always need to have an object.

//Method hiding: If two static methods tries to get override then it is not overriding but it is method hiding.
//That means method resolution is based on reference type but not run time object.

