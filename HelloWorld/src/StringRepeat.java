import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringRepeat {
	
	public static void main(String[] args) {
	
	int arr[]={3,2,1,6,5,9,7,8,4,10,11,12,14,14}; //7 is missing, 3 is repeating
	
	List<Integer> alist=new ArrayList<Integer>();
	
	for(int a:arr){
		alist.add(a);
	}
	Collections.sort(alist);
	System.out.println(alist);
	
	int count=0;
	
	Iterator<Integer> itr=alist.iterator();
	
	while(itr.hasNext()){
		++count;
		int temp=itr.next();
		if(temp==count)
			continue;
		else
		{
			System.out.println("Repeated number is"+temp);
			break;
		}
	}

	for(int i=1;i<alist.size();i++){
		if(alist.contains(i))
			continue;
		else
			System.out.println("Missing number is"+i);
	}
	
	// Contributed by Jay Shah
	
	}
}
