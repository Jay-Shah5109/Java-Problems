import java.util.*;

public class MaprReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Filter, map and reduce example
		
		List<Integer> numbers=Arrays.asList(4,2,4,6,2,7,8,2,1,4,6);
		
		List<String> liststring=Arrays.asList("coreJava","Spring","Hibernate","Encyclopedia");
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Jay");
		hm.put(2, "Ram");
		hm.put(3, "Virat");
		
		System.out.println("Output of map.put="+hm.put(3,"Ramesh"));
		
		int sum1=numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1); // parallel processing
		
		int sum2=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum2);
		
		Optional<Integer> integersum=numbers.stream().reduce(Integer::sum); // use method reference
		System.out.println(integersum.get());
		
		int integermultiply=numbers.stream().reduce(1,(a,b)->a*b); // 1 is the initial value
		System.out.println(integermultiply);
		
		// To find the maximum value
		
		int maxvalue=numbers.stream().reduce(0 , (a,b) -> a>b ? a : b);
		System.out.println(maxvalue);
		
		// Find minimum value from given set of integers
		
		Optional<Integer> valuemin=numbers.stream().reduce(Integer::min);
		System.out.println(valuemin.get());
		
		Optional<String> longestString=liststring.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
		System.out.println(longestString.get());
		
		OptionalDouble averageofall=numbers.stream().mapToDouble(i->i).average();
		System.out.println(averageofall.getAsDouble()); // average of all numbers by using Stream
		
		
		

	}

}
