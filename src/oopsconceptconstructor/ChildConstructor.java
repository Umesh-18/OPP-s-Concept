package oopsconceptconstructor;

public class ChildConstructor extends ParentConstructor {

	public ChildConstructor () {
		
		System.out.println("no argument child constructor");
	}
	
	public static void main(String[] args) {
		
		ChildConstructor c = new ChildConstructor();
	}
}
//Child class Constructor will call automatically parent class constructor in all cases(Whether constructor is present parent class or not , if not present it will call default constructor of parent class.)

