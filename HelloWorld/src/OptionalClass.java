import java.util.Optional;

class Customer {
	private int id;
	private String name;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name); // This is more safe and secured, since it will not throw any error even if
		// it is a null value and it will return an empty object 
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Customer() {
		//super();
		//this.id = id;
		//this.name = name;
	}
	

}

public class OptionalClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer(101,null);
		Customer c2=new Customer();
		System.out.println(c2.getName());
		//String name=c2.getName();
		//name.toUpperCase();
		
		
		//Create empty optional object
		
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		
		
		Optional<Object> myoptional=Optional.ofNullable("Jay");
		System.out.println("Printing myoptional:"+myoptional);
		
		
		
		
		// Use of Optional.of
		
		//Optional<String> emailOptional=Optional.of(c1.getName()); // The Optional class will do null check, 
		// it has requireNonNull method present which takes one value and checks if the value is null, and if it is null 
		// then it will throw nullpointer exception and if not then it will return the object
		// So, go for 'of' only if we are sure that the object is not null
		//System.out.println(emailOptional);
		
		
		// OPtional.ofNullable
		
		Optional<String> nameOptional=Optional.ofNullable(c1.getName());
		//System.out.println("Printing nameOptional:"+nameOptional); // this will not return null pointer exception, instead,
		// it will return the empty null object
		//Output is: Printing nameOptional:Optional.empty
		
		// System.out.println("Printing nameOptional's actual value:"+nameOptional.get()); // this will return the actual value
		
		// the above statement will generate below exception
		
		//Exception in thread "main" java.util.NoSuchElementException: No value present
		//at java.util.Optional.get(Unknown Source)
		//at OptionalClass.main(OptionalClass.java:71)
		
		// To avoid this error, we can write below statments:
		
		if(nameOptional.isPresent()){ // isPresent method will return false in this case, thus we will not get any exception
			System.out.println("Printing nameOptional's actual value:"+nameOptional.get());
		}
		
		//If we want to return something, even if the value is null then, see below statement(orElse method)
		
		System.out.println("Printing nameOptional's actual value:"+nameOptional.orElse("Rahul"));
		
		// Below statement shows, if we want to throw customized exception then use orElseThrow method
		
		//System.out.println("Printing nameOptional's actual value:"+nameOptional.orElseThrow(()->new IllegalArgumentException("The value is not present")));
		
		// Below statement shows if we want to modify the object, using map operation
		
		System.out.println("Printing nameOptional's actual value:"+nameOptional.map(String::toUpperCase).orElseGet(()->"Default name.."));
		
		// Refer to the getter and setter methods for how can we use the Optional class as the return type and 
		// not primitive data types
		
		
	}

}
