package oopsconceptvariable;

public class ChildVariable extends ParentVariable {

		int i = 10;
		static int x = 100;
		public void m4() {
		
			int i = 5;
			
			System.out.println("the value of local variable of method m4 i is: "+i);
			
			System.out.println("the non-static variable from parent varibale class is i:"+super.i);
			
			System.out.println("the non-static variable from child variable class is:"+this.i);

			System.out.println("the value of static variable from child class is:"+x);
			System.out.println("the value of static variable from parent class is:"+ParentVariable.x);
			
	}
		public static void main(String[] args) {
			
			ChildVariable c = new ChildVariable();
			c.m4();
			ParentVariable d = new ParentVariable();
			System.out.println(d.i);
			System.out.println(d.j);
			m3(); 
			System.out.println(ParentVariable.x);
		}
	
}
