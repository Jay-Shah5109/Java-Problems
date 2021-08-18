import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringlist=Arrays.asList("Jay","Jack","Steve","James","Robert","Adam");
		
	stringlist.stream().filter(s->s.contains("a")).collect(Collectors.toList()).forEach(s->System.out.println(s));
		

	}

}
