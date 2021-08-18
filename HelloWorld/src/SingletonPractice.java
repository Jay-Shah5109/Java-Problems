
public class SingletonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ObjectReplica obj=new ObjectReplica(); // old way
		
		System.out.println(ObjectReplica.getInstance()); // This is eager instantiation

	}

}

class ObjectReplica{
	
	static ObjectReplica obj=new ObjectReplica();
	
	// private constructor
	private ObjectReplica(){
		System.out.println("Instance created!");
	}
	
	public static Object getInstance(){
		return obj;
	}
	
}
