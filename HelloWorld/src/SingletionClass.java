
public class SingletionClass {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable(){
			public void run(){
				System.out.println(MyClass.getInstance());
			}
		});
		Thread t2=new Thread(new Runnable(){
			public void run(){
				System.out.println(MyClass.getInstance());
			}
		});
		t1.start();
		t2.start();
	}
}

class MyClass{
	
	
	//create a static instance 
	static MyClass obj; // we are writing static here because, the method below is static 
	//and will return the same object
	
	
	//create a private constructor
	private MyClass(){
		
	}
	
	//static method that will return the object
	public static MyClass getInstance(){
		synchronized(MyClass.class){
		if(obj==null){
		obj=new MyClass();}}
		System.out.println("I am out of sync so will be printed multiple times...");
		return obj;
	}
	
	
	
	
}
