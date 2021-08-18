import java.util.Optional;

public class OptionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Object> myoptional=Optional.ofNullable(new String("Jay"));
		System.out.println(myoptional);
		//System.out.println(myoptional.map(String::toUpperCase).orElseGet(()->"Default.."));
		
		

	}

}
