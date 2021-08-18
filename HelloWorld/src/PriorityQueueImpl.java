import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> pq=new PriorityQueue<>();
		
		Map<Integer,String> mymap=new HashMap<Integer,String>();
		
		mymap.put(1, "firstJay");
		mymap.put(2, "SecondJay");
		mymap.put(3, "ThirdJay");
		mymap.put(2, "fourthJay");
		mymap.put(4, "fifthJay");
		
		Iterator itrhash=mymap.entrySet().iterator();
		
		Iterator newitr=mymap.entrySet().iterator(); // just created the new iterator for reference
		
		System.out.println("Printing the hashmap elements.....");
		
		/*while(itrhash.hasNext()){
			Map.Entry mapElement=(Map.Entry)itrhash.next();
			String sid=(String)mapElement.getValue()+"Helllooo";
			System.out.println(mapElement.getKey()+"modified string: "+sid);
		}*/
		
		/*int i=1;
		System.out.println(mymap.get(1));
		while(itrhash.hasNext()){
			System.out.println(mymap.get(i));
			i++;
		}*/
		
		mymap.forEach((k,v)->System.out.println(k+"+"+v));
		
		
		pq.add("Jay");
		pq.add("virat");
		pq.add("ms dhoni");
		pq.add("rohit sharma");
		
		System.out.println(pq.peek());
		
		pq.poll();
		
		for(String s:pq){
			System.out.print(" "+s);
		}
		
		
		

	}

}
