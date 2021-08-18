import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample{
	
	/*@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hello World, lets learn Java8";
	}*/
	public static void main(String[] args) {
	//Supplier<String> supp=()-> "Hello World, lets learn Java8. Hi Jay!";
	//System.out.println(supp.get());
	
	List<String> list=Arrays.asList();
	//use of streams API
	
	System.out.println(list.stream().findAny().orElseGet(()-> "Hello World, lets learn Java8. Hi Jay!"));// it will print this statement since the arraylist is empty.
	
	}
}
