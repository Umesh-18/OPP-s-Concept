package accessmodifierabstract;

public class Child2 extends Child1 {

@Override
public void m4() {
	// TODO Auto-generated method stub
	
}
@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

public static void main(String[] args) {
	
	Child2 c2 = new Child2();
	c2.m1();
	c2.m2();
	c2.m3();
	
}
}
//Note: final cannot be used together with abstract.

//We cannot create an object of abstract class,
//but we can access the complete methods from abstract class through child object.



//iv. abstract: A modifier which applicable to class and methods.
//If we don’t have an idea of complete functionality i.e we know about the major part but we are not sure about the implementation,
//then we should declare or use abstract modifier.

//If we declare a class as abstract then it is not necessary to declare an abstract method,
//but if a class contains abstract method then we have to declare that class as abstract.

//Every child class of abstract class has to implement all the abstract methods,
//otherwise we have to declare that class as abstract and have to provide the implementation in subsequent child classes.
