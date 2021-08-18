import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapFindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> hm=new HashMap<>();
		List<Integer> mylist=new ArrayList<>();
		
		hm.put(10, "firstelement");
		hm.put(8, "Secondelement");
		hm.put(3, "Thirdelement");
		hm.put(15, "fourthelement");
		hm.put(9, "fifthelement");
		System.out.println(hm.put(8, "Jay")); // returns the output as Secondelement
		
		Iterator hashitr=hm.entrySet().iterator();
		
		while(hashitr.hasNext()){
			Map.Entry mapelement=(Map.Entry)hashitr.next();
			int myid=(int)mapelement.getKey();
			String myvalue=(String)mapelement.getValue();
			System.out.println(myvalue);
			mylist.add(myid);
		}
		
		Collections.sort(mylist);
		
		System.out.println((mylist.get(mylist.size()-1)+" = "+hm.get(mylist.get(mylist.size()-1))));
	}

}
