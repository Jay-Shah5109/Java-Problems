import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample{
	public static void main(String[] args) {
		//Consumer<Integer> consumer=t->System.out.println(t);
		//consumer.accept(13);
		
		List<Integer> list=Arrays.asList(1,2,3,6,32,33,15,11,24,334);
		//use of streams API
		
		list.stream().forEach(t->System.out.println(t));
		
	}
}
