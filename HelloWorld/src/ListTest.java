import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListTest {
	
	public static void main(String[] args) {
		
		
		List<Integer> mylist = new ArrayList<>();
		
		Stack<String> stackstring=new Stack<String>();
		
		mylist.add(2);
		mylist.add(4);
		
		stackstring.push("1");
		
		String newly=stackstring.pop();
		
		System.out.println(newly);
		
		
		int i=6;
		System.out.println(i+newly);
		double d=3.23;
		float  f=(float) 7.22;
		
		System.out.println(i+mylist.get(1)+d+newly+i);
		
		
		
	}

}
