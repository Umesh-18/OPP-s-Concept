package oopsconceptconstructor;

public class ChildConstructor2 {

	public ChildConstructor2() {
		
		System.out.println("with argument child constructor2");
	}
	
 public static void main(String[] args) {
	
	 ChildConstructor2 c2 = new ChildConstructor2();
	
	 // Compile time error because all constructors in parent class are not by default available to child, hence constructor doesn’t follow inheritance principle.

}
}