package polymorphism;

public class ChildVariable extends ParentVariable {
	
static int i = 20;
	
	public static void m1() {
		
		System.out.println("0 argument Child Variable method ");
		
	}
	
	public static void main(String[] args) {
		
		ParentVariable p  = new ParentVariable();
		System.out.println(p.i);//10
		m1();// Parent Static method will get execute
		
		
		ChildVariable c  = new ChildVariable();
		System.out.println(i);//20
		m1();// child Static method will get execute
		
		ParentVariable pp  = new ChildVariable();
		pp.m1();// Parent Static method will get execute
		m1();// child Static method will get execute
	
	}
}


//Polymorphism with respect to variable:

//Variable resolution always take care by compiler based reference type,
//whether the type of variable is static or non static. 

//In short overriding concept is not applicable to variables but only for methods

