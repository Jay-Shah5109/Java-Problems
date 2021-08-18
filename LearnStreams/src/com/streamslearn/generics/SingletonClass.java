package com.streamslearn.generics;

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyClass my=MyClass.getInstance();
		//MyClass my1=MyClass.getInstance();
		//System.out.println(my);
		//System.out.println(my1);
		
		Thread t1=new Thread(new Runnable(){
			public void run(){
				MyClass my1=MyClass.getInstance();
				System.out.println(my1);
			}
		});
		Thread t2=new Thread(new Runnable(){
			public void run(){
				MyClass my2=MyClass.getInstance();
				System.out.println(my2);
			}
		});
		t1.start();
		t2.start();
		//System.out.println(my1);
		//System.out.println(my2);

	}
	
	

}

class MyClass{
	static MyClass obj;
	private MyClass(){
		
	}
	public static MyClass getInstance(){
		synchronized(MyClass.class){
		if(obj==null){
		obj=new MyClass();
		}
		return obj;
		}
	}
}
