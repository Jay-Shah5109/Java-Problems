import java.util.ArrayList;
import java.util.List;

interface Sayable{
	void say(); // only 1 abstract method is present so it is a functional interface
	
}

interface MR2{
	void calling(String mssg); 
}

class MethodReference{
	public void saySomething(String s){
		System.out.println("Hello, I am speaking..");
	}
}


class MyClass1{
	
	MyClass1(String mssg){
		System.out.println("MyClass constructor called!!");
	}
}

interface FuncInterface{
	void sum(int a,int b);
}

public class java8practice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		//Sayable say1=MethodReference::saySomething;
		//say1.say();
		
		MethodReference mr=new MethodReference();
	//	Sayable say2=mr::saySomething;
		//say2.say();
		
		
		MR2 myclass1=MyClass1::new;
		myclass1.calling("Jay");
		
		
		FuncInterface fi=(a,b)->System.out.println(a+b); // this is the implementation for Lambda Function
		fi.sum(4, 5);
		
		String s="abc2def2ghi2jkl2mno2";
		String str[]=s.split("2",4);
		for(String s1:str){
			
			System.out.println(s1);
		}
		
		
		
		
		
		
	
		
		

	}

}
