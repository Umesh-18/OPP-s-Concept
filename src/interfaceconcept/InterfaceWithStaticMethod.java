package interfaceconcept;

public interface InterfaceWithStaticMethod {

	public static void m1() {
		
		System.out.println("Static method m1 from InterfaceWithStaticMethod");
	}
	public void m2();
	
	public static void main(String[] args) {
		m1();
	}
}
//We can have static method inside an interface provided we have the body of the method
//as well. Static method cannot define without body inside an interface.
