import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map;

public class MapSort {
	
	public static void main(String[] args) {
		Map<Integer,String> mymap=new HashMap<>();
		mymap.put(1, "jay");
		mymap.put(2, "vijay");
		mymap.put(3, "ajay");
		mymap.put(4, "jayesh");
		mymap.put(5, "jayant");
		
		
		List<Entry<String,Integer>> mylist= new ArrayList<>(mymap.entrySet());
		
		
		
		//Collections.sort((List<Integer>) mymap.entrySet());
		
	}

}
