import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]={"jay","Rahul","virat","MS","Hardik","naman","Harbhajan","bumrah","Jadeja","Ashwin"};
		
		List<String> newlist=Arrays.asList("raman","raman","jay","Rahul","virat","MS","Hardik","naman","Harbhajan","bumrah","Jadeja","Ashwin");
		
		/*Arrays.sort(arr,new Comparator<String>(){
			public int compare(String a, String b){
				return a.toLowerCase().compareTo(b.toLowerCase());
			}
		});*/
		
		for(String s:arr){
		System.out.println(s);
		}
		
	//	Arrays.sort(arr,(a,b)->a.compareToIgnoreCase(b)); // this is lambda function
		
		Arrays.sort(arr,String::compareToIgnoreCase); // this is method reference
		
		System.out.println("after method reference");
		
		for(String s:arr){
			System.out.println(s);
			}
		
		Arrays.asList(arr).forEach(System.out::println);
		
		System.out.println("Using grouping by in Streams in List---");
		
		Map<String,List<String>> collectByWords=newlist.stream().collect(Collectors.groupingBy(word->word));
		
		System.out.println(collectByWords);

	}

}
