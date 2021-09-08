import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnagramLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // [abc,cab,bac],[rbc,brc]
		
		
		List<String> list=Arrays.asList("abc","cab","bac","rbc","brc");
		Map<String,List<String>> newhashmap=new HashMap<String,List<String>>();
		//List<String> newlist=new ArrayList<>();
		//Iterator itrhash=newhashmap.entrySet().iterator();
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
			String token=(String)itr.next();
			char[] char_arr=token.toCharArray();
			Arrays.sort(char_arr);
			String newword=new String(char_arr);
			
			//If the key is already present in the hashmap
			if(newhashmap.containsKey(newword)){
				System.out.println("Already present, adding:"+token);
				newhashmap.get(newword).add(token);
			}
			
			//If the key is not present in the hashmap
			else{
				System.out.println("Not present, adding:"+token);
				List words=new ArrayList<>();
				words.add(token);
				newhashmap.put(newword, words);
			}
			
		}
		
		for(Map.Entry m:newhashmap.entrySet()){
			System.out.println("Key= "+m.getKey()+"Value= "+m.getValue());
		}
		

	}

}
