import mobile.*;
import mobile.samsung.*;
// or we import that only class
// import mobile.MobileTest;

class DemoProgram
{
	public static void main(String args[])
	{
		// or we can do this method also
		// mobile.MobileTest m1 = new MobileTest();
		MobileTest m1 = new MobileTest();
		m1.display();
		mobileDemo m2 = new mobileDemo();
		m2.display();
		samTest s1 = new samTest();
		s1.display();
	}
}