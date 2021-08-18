import java.util.ArrayList;
import java.util.List;

public class LearnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> newlist=new ArrayList<Integer>();
		newlist.add(1);
		
		String s="ersd@swer@erererrf@ressgg@eer";
		
		String snew[]=s.split("@",4);
		
		for(String s1:snew){
		System.out.println(s1);
		}

	}

}
