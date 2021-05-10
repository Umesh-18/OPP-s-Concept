package interfaceconcept;

//Note: Multiple inheritance is possible with the help of interface.

public class MultipleInheritanceWithInterface implements Interface1,Interface2,InterfaceWithStaticMethod{

	public void m1() {
		System.out.println("m1");
}
	public void m2() {
		System.out.println("m2");
}

	public void m3() {
		System.out.println("m3");
}

	public void m4() {
		System.out.println("m4");
}
//	Example for calling method from Parent reference and child object.
	public static void main(String[] args) {
		MultipleInheritanceWithInterface i = new MultipleInheritanceWithInterface();
		i.m1();
		i.m2();
		System.out.println(Interface1.i);//10 
		System.out.println(Interface2.i);//20
		InterfaceWithStaticMethod.m1();//Static method from InterfaceWithStaticMethod
		
		//interface1 i1 = new MultipleInheritanceWithInterface();not recommended
		//i1.m1();MultipleInheritanceWithInterface method m1 will be executed
	}
}


//Note: If both interfaces have same name of methods in it then the class which is
//providing the implementation have to define those methods only once.

//If both the interfaces method having the same signature but return types are
//different so the class which going implements those interface will not be able to
//implement that method.
