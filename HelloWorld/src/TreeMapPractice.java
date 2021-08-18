import java.util.Iterator;
import java.util.*;

public class TreeMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> newtreemap=new TreeMap<Integer,String>();
		
		newtreemap.put(1, "one");
		newtreemap.put(4, "four");
		newtreemap.put(3, "three");
		newtreemap.put(2, "two");
		newtreemap.put(3, "five");
		newtreemap.put(5, null);
		
		Map<Integer,String> newhm=new HashMap<Integer,String>();
		
		newhm.put(5, "Jay");
		newhm.put(6, null);
		
		
		
		
		//Traverse through the treemap using iterator
		
		Iterator itrtree=newtreemap.entrySet().iterator();
		
		while(itrtree.hasNext()){
			Map.Entry mapElement=(Map.Entry)itrtree.next();
			int key=(Integer)mapElement.getKey();
			String value=(String)mapElement.getValue();
			System.out.println("the key is:"+key+" and the value is: "+value);
		}
		
		// another way to traverse the TreeMap
		
		System.out.println("--------------------------------------------------");
		
		for(Map.Entry mapelement:newtreemap.entrySet()){
			int newkey=(Integer)mapelement.getKey();
			String newstring=(String)mapelement.getValue();
			System.out.println("the key is:"+newkey+" and the value is: "+newstring);
		}
		
		System.out.println("HashMap traversal...");
		// Traversing thru the hashmap
		
		Iterator itrhm=newhm.entrySet().iterator();
		
		while(itrhm.hasNext()){
			Map.Entry mapElement=(Map.Entry)itrhm.next();
			int key=(Integer)mapElement.getKey();
			String value=(String)mapElement.getValue();
			System.out.println("the key is:"+key+" and the value is: "+value);
		}
		
		
		
		

	}

}
