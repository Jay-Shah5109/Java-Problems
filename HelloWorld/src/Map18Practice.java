import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map18Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={5,3,5,6,1,3,5,6,7,5,8,9,7,5,1,0,0,0,6,2,2,4,6,7,9,5,4,3,2,7,8,9};
		
		/*Map<String,Integer> hm=new HashMap<>();
		hm.put("jay", 18);
		hm.put("virat", 25);
		hm.put("rahul", 325);
		hm.put("john", 525);
		hm.put("john", 526);
		
		Iterator itr=hm.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry mapElement=(Map.Entry)itr.next();
			String id=(String)mapElement.getKey();
			Integer value=(Integer)mapElement.getValue();
			System.out.println("The ID is:"+id+" and the value is"+value);
		}*/
		Map<Integer,Integer> countermap=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			Integer c=(Integer)countermap.get(arr[i]);
			if(countermap.get(arr[i])==null){
				countermap.put(arr[i],1);
			}
			else{
				c++;
				countermap.put(arr[i],c);
			}
		}
		for(Map.Entry m:countermap.entrySet()){
			System.out.println("Number: "+m.getKey()+" Count = "+m.getValue());
		}
		
		System.out.println(arr.length);
	}
}
