//Compile time polymorphism example

class Example{
	
	public void show(int a, int b){
		System.out.println(a+b);
	}
	
	public void show(int a){
		System.out.println(a);
	}
	
	public void show(int a, int b, int c){
		
		System.out.println(a+b+c);
	}

}
public class ComplieTimePoly {
	
	
	public static void main(String[] args) {
		
		Example e=new Example();
		
		e.show(5);
		
		e.show(5,6);
		
		e.show(5,6,7);
		
	}

}
