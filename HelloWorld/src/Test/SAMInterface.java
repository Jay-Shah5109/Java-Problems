package Test;


public interface SAMInterface {
	
	public int sum(int a, int b);
	
	default void printHello(){
		System.out.println("hello");
	}
	
	static void sayHi(){
		System.out.println("Hi User!");
	}
	
}
