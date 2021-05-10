package oopsconceptconstructor;

public class ChildConstructor1 extends ParentConstructor1 {
	

	public ChildConstructor1 () {
		
		super(10,20);
		System.out.println("no argument child constructor1"
				+ "");
	}
	
	public static void main(String[] args) {
		
		ChildConstructor1 c1 = new ChildConstructor1();
	}
}

//If Child class constructor type doesn’t matches with the parent then specifically we have to call parent class constructor in the first line of child by using super().
