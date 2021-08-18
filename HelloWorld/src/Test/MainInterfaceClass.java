package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

class SAMInterfaceClass implements SAMInterface{
	
	public int sum(int a, int b){
		return (a+b);
	}
}

/*class Interface2Class implements Interface2{
	
	public int returnValue(int n){
		return n*5;
	}
}*/

public class MainInterfaceClass{
	
	public static void main(String[] args) {
		
		SAMInterface si=(a,b)->(a+b);
		
		System.out.println(si.sum(4, 5));
		
		Interface2 i2=(x)->(x*5);	
		
		System.out.println(i2.returnValue(100));
		
		List<Integer> newlist=Arrays.asList(4,5,6,7,3,2,45,7);
		
		Optional<Integer> newoptional=newlist.stream().filter(s->s%2==0).reduce((a,b)->a+b);
		System.out.println(newoptional.get());
		
		
		List<Integer> newlist2=newlist.stream().map(a->a*5).collect(Collectors.toList());
		
		System.out.println(newlist2);
		
		List<Integer> newlist3=Arrays.asList(2,4,6,8,10);
		
		// count the number of odd elements in newlist3 and if not present then return dummy value -1
		
		//newlist3.stream().filter(s->s%2==0).findAny().orElseGet(()->System.out.println("Nothing found."));
		//System.out.println(newlist3.stream().filter(s->s%2!=0).findAny().orElse(()->System.out.println("Nothing found.")));
		
		
		// FIND max element from the newlist3
		
		//Integer max=newlist3.stream().maptoInt(a->a).max().orElseThrow(NoSuchElementException::new);
		Optional<Integer> max=newlist3.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		System.out.println(max.get());
		
		System.out.println("The elements of newlist3 are:");
		newlist3.forEach(s->System.out.println(s));
		
		System.out.println("Max element from the newlist3 is:");
		Optional<Integer> maxi=newlist3.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		System.out.println(maxi.get());
		
		
		
	}
	

}
