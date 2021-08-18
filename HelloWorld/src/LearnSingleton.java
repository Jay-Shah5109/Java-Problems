
public class LearnSingleton implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj1=Abc.INSTANCE; // this will create the object of type Abc
		obj1.i=5;
		obj1.show();
		
		Abc obj2=Abc.INSTANCE; // this will create the object of type Abc
		obj2.i=10;
		obj2.show();
		
		
	}

}


enum Abc{ // special type of class
	
	INSTANCE; // this will create a private constructor by default
	
	int i;
	public void show(){
		System.out.println(i);
	}
	
	
	
}
