package interfaceconcept;

public interface Interface2 {

	int i = 20;
	
	public void m1();

	public void m3();
	
	public void m4();
	
}

//Variable resolution with respect to interface:

//Variables inside an interface are by default public static and final whether we are
//declaring or not.

//Reason for public: To access them from anywhere.
//Reason for static: User should be able to access it without object creation.
//Reason for final: As static variable shares its memory with all objects so 
//implemented class is not allowed to change its value.

//Note: 
//Public static int I = 20;
//Public static final int I = 20;
//Public int I =20
//All three of them are same inside interface.
