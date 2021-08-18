interface A{
	default void show(){
		System.out.println("I am in Interface A");
	}
}
interface B{
	default void show(){
		System.out.println("I am in Interface B");
	}
	/*default boolean equals(Object O){ // This will give error since we cannot override any methods inside the interface
		return true;
	}*/
	static void teststatic(){
		System.out.println("I am testing static method");
	}
}

class C{
	public void show(){
		System.out.println("I am in Class C");
	}
}

public class TestInterface extends C implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface mytest=new TestInterface();
		mytest.show();
		B.teststatic();
	}
}
