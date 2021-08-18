import java.util.*;

public class ForeachStream {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Jay");
		list.add("rahul");
		list.add("Virat");
		list.add("Rohit");
		list.add("MSD");
	
	for(String s:list){
		//System.out.println(s);
	}
	
	//list.stream().forEach(i->System.out.println(i));
	
	//System.out.println("findany stream part----------------");
	
	//System.out.println(list.stream().findAny().orElseGet(()->"There are no elements in stream!!"));
	
	
	list.stream().filter((s)->s.startsWith("R")).forEach((s)->System.out.println(s));

}
}
