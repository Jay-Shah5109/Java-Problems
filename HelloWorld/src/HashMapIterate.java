import java.util.HashMap;
import java.util.Map;

public class HashMapIterate {
	public static void main(String[] args) {
		int arr[]={77,33,112,3,2,4,5,2,5,7,3,4,6,3,2,3,4,8,9,0,11,2,1,45,45};
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			Integer c=hmap.get(arr[i]);
			if(hmap.get(arr[i])==null){
				hmap.put(arr[i], 1);
			}
			else{
				c++;
				hmap.put(arr[i], c);
			}
		}
		for(Map.Entry m:hmap.entrySet()){
			System.out.println("Frequency of the key: "+m.getKey()+" is: "+m.getValue());
		}	
	}
}
