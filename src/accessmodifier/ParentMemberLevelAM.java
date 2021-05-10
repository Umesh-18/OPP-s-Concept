package accessmodifier;

public class ParentMemberLevelAM {
          
	protected int i = 20;
	
	protected void m1() {
		
		System.out.println("Protected method is running");
}

}
//1. public :- If we declare a method or a variable as public,
//then the visibility of that element is throughout the project.

//2. <default>:  If a particular method  or variable declares as <default>,
//then it would be accessible throughout  the package only.

//3. private: If a particular method or variable is declared as private,
//then we can access method only in the class where it was defined.