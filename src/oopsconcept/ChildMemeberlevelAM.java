package oopsconcept;

import accessmodifier.ParentMemberLevelAM;//4. protected = <default>+ child classes

public class ChildMemeberlevelAM extends ParentMemberLevelAM {
	
	public static void main(String[] args) {
		
		ChildMemeberlevelAM c = new ChildMemeberlevelAM();
		c.m1();
		System.out.println(c.i);
		
//	4. protected = <default>+ child classes
//	We can access the  protected members with in the package as we are doing in <default>,
//	but when we wants to access them outside the package,
//	then we should use child reference only.
	
}
}

//5. final: If we declare a variable as final,
//then we cannot perform re-assignment of that variable,
//except the place where it got initialized.

//**If we declare a method as final then 
//we will not be able to override that particular method. [regarding polymorphism]