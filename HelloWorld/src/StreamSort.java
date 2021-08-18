import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSort {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("jay");
		list.add("jay2");
		list.add("jay3");
		list.add("jay4");
		list.add("jay5");
		list.add("jay6");
		
		//Collections.sort(list); /// ascending
		
		//Collections.reverse(list);/// descending
		
		//System.out.println(list);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
		
		//list.stream().sorted()
	}

}
