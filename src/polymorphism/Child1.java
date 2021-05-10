package polymorphism;

public class Child1 extends Parent1 {

	public void m1(int i, int j)
	{
		System.out.println("m1 method of child with 2 argument");
	}
	
	public void m2()
	{
		System.out.println("m2 method of child with null argument");
	}
	
	public static void main(String[] args) {
		
		// 1 st object 
		
		Parent1 p = new Parent1();
		p.m1();// Parent's class method
		p.m1(10);// Parent's class method
		p.m2();// Parent's class method
		
		System.out.println();
		
		// 2 nd object
		
		Child1 c = new Child1();
		c.m1();// parent class method
		c.m1(5);//parent class method
		c.m1(10,20);// Child class method
		c.m2();// Child class method
		
		System.out.println();
		
		// 3 rd object
		
		Parent1 pp = new Child1();
		pp.m1();// parent class method
		pp.m1(10);// parent class method
		pp.m2();// Child class method
		

}	
}

//b. Overriding: A method can be called as Overridden method if the name and signature in the child and Parent class is same.
//Note: Method resolution is completely based on object.
//
//b. Overriding is also known as run time polymorphism and Late binding.
//Reason: At run time of program for over ridden method we get to know which method will get execute.
//c. In Overriding method resolution is based on run time object.



//NOTE: Parent reference can be used to hold child object but converse is not possible i.e child reference variable cannot be used to hold parent Object.
//Parent pp = new Child();--------- Valid
//Child cc =new Parent(); // not valid in java
