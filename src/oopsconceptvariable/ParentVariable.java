package oopsconceptvariable;

public class ParentVariable {
		int i = 40;
		int j = 30;
		static int x = 20;
	
	public void m1() {
		
		System.out.println("parent class method m1");
	}
	public void m2() {
		
		System.out.println("parent class method m2");
	}
	public static void m3() {
		int x = 20;
		int y = 5;
		int z = x*y;
		System.out.println("parent class static method m3, value of z is:"+z );
	}
	}

