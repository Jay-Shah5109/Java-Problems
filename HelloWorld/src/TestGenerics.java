import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Container<T extends Number>{ // Now this class will only accept those classes in place of T which extends "Number" class.
	T value;
	
	public void show(){
		System.out.println(value.getClass().getName());
	}
	
	public void test(ArrayList<? extends T> alist){
		//some implementation
	}
}


public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> alist=Arrays.asList(1,2,3,4,5,6,7,55,34,6,8,3,2);
		
		System.out.println("Elements in the arraylist are:");
		alist.stream().forEach(t->System.out.print(t+" "));
		
		Container<Integer> cont=new Container<Integer>();
		cont.value=4;
		cont.show();
		
		Container<Number> cont1=new Container<>();
		cont1.test(new ArrayList<>());
		
		System.out.println("Printing after defining our own consumer interface");
		
		Consumer<Integer> cons=new Consumer<Integer>(){
			public void accept(Integer i){
				System.out.println(i);
			}
		};
		
		Consumer<Integer> cons_shortened=(i)->System.out.println(i);
		
		alist.forEach(cons);
		alist.forEach(cons_shortened);
		
		
	}
}
