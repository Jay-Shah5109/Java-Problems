import java.io.*;
import java.lang.*;

class lessException extends Exception{
	public String toString(){
		return "The value of a is less than 5, please increment it!";
	}
}

public class MyException{

	public static void main(String args[]){
	String s1="Jay";
	int a=2,b=3,c=1;
	int answer=0;
	try{
		answer=a/c;
		System.out.println(answer);
		if(a<5){
			throw new lessException();
		}
	}
	catch(ArithmeticException e){
		System.out.println("You have division by ZERO");
		System.out.println("Please change the value of denominator.");
	}
	catch(lessException e){
		System.out.println(e);
	}
	}
}
