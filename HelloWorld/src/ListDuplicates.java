import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDuplicates {
	public static void main(String[] args) {
		
		List<Integer> newlist=new ArrayList<>(Arrays
                .asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		
		List<Integer> duplist=new ArrayList<>();
		
		// printing the elements of arraylist using iterator class
		
		Iterator itr=newlist.iterator();
		
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}
		
		
		for(Integer i:newlist){
			if(!duplist.contains(i)){
				duplist.add(i);
			}
		}
		
		String s="sjss@sdjsks@ddds@ahello@3jwekje";
		String[] newstr=s.split("@",5);
		for(String m:newstr){
			System.out.print(" "+m);
		}
		//System.out.println(newstr);
		System.out.println(duplist);
		
		System.out.println(s.length());
	}
}
