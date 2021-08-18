import java.io.*;

public class StringsPractice {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		String s=reader.readLine(); //Hello Good Morning, it is a good day!!!
		
		//substring method
		
		System.out.println(s.substring(1,5));// ello
		
		String[] c= s.split(" ",4);
		for(String str:c){
			System.out.println(str);
		}
		
		
		System.out.println("Now printing the split function output with 5.......");
		String[] newstring=s.split(" ",5);
		
		for(String snew:newstring){
			System.out.println(snew);
		}
		
		String newstringone="hello it is a good day!!!";
		String copystring="it is not a good day!!!";
		System.out.println(newstringone.trim());
		
		if(newstringone.regionMatches(6, copystring, 0, 18))
			System.out.println("Success!!!");
		
		
		
		
		
		
		

	}

}
