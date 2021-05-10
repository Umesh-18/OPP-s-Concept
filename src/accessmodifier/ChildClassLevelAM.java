package accessmodifier;

public class ChildClassLevelAM extends ParentClassLevelAM{
	//i.e the class which has declared as final cannot be extended by another class.
	
	final int i = 20;
	
	public void m2() {
		
		System.out.println("no argument method from child class level AM");
	
	}
	
	public  ChildClassLevelAM() {
		
		System.out.println("Constructor from child class class level AM");
	}
	
	public static void main(String[] args) {
		 i = 40;
		 //Compile error: We cannot reassign the value to variable i as it is a final variable.
		ChildClassLevelAM c = new ChildClassLevelAM();
		c.m2();
		
		ParentClassLevelAM p = new ParentClassLevelAM();
		// we can call constructor from any class by just creating object of that consturctor
		p.m1();// for calling non-static method in static method
		
	}
}


//iii. <default>:  The class which declares as <default> can be accessible with in the package. 
//We cannot access it outside of the package.


//iv. abstract
//Note: final cannot be used together with abstract.