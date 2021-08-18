import java.util.ArrayList;
import java.util.List;

public class AlistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> newlist=new ArrayList<String>();
		
		newlist.add("PJay");
		newlist.add("PVirat");
		newlist.add("Bolt");
		
		for(String i: newlist){
			if(i.indexOf("P")==0){
				System.out.println("Yes, "+i);;
			}
			else
				System.out.println(i);
		}
		

	}

}
