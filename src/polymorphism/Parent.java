package polymorphism;

public class Parent {

	public void m1() {
		
		System.out.println("no argument method m1 from Parent");
}
public void m1(int i) {
		
		System.out.println("1 argument method m1 from Parent");
}
public void m1(int i, int j) {
	
	System.out.println("2 argument method m1 from Parent");
}
public void m1(boolean a, char c) {
	
	System.out.println("1 boolean and 1 char argument method m1 from Parent");

}


public static void main(String[] args) {
	
	Parent t = new Parent();
	t.m1();
	t.m1(10);
	t.m1(20, 30);
	t.m1(false, 't');
	
}
}

//a. Overloading: A method can be called as Overloaded if and only if the method name is same but the argument is different.
//i.e atleast order of the argument passes or data type of the arguments.

//b. Overloading is also known as Compile time polymorphism and Early binding.

//Reason: At the time of compilation of program for over loaded method we get to know which method will get execute.

//c. In Overloading method resolution is based on reference variable.

//Note: Overloading is applicable for inheritance as well.
