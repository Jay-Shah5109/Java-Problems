import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample{
	
	//@Override
	/*public boolean test(Integer i) {
		// TODO Auto-generated method stub
		if(i%2==0)
			return true;
		else
			return false;
	}*/
	
	public static void main(String[] args) {
		Predicate<Integer> pre=(i)->{
			// TODO Auto-generated method stub
			if(i%2==0)
				return true;
			else
				return false;
		};
		System.out.println(pre.test(32));
		
		List<Integer> list=Arrays.asList(1,2,3,6,32,33,15,11,24,334);
		//use of streams API
		
		list.stream().filter(pre).forEach(t->System.out.println(t));
	}
	
	
	
	
	
}
