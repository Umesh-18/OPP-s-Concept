package oopsconcept;

public class Child extends Parent {

	public void m4() {
	System.out.println("Child class method m4");
}
	public static void m5() {
		int x = 5;
		int y = 5;
		int z = x*y;
		System.out.println("parent class static method m5, value of z is:"+z );	
}
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		m3();
		c.m4();
		m5();
		
	}
}
//NOTE: child class has extended only parent class here
