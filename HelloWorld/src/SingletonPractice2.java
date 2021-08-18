
public class SingletonPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ObjectReplica2 obj2=ObjectReplica2.getInstance();
		
		System.out.println(ObjectReplica2.getInstance());
		

	}

}

class ObjectReplica2{
	
	static ObjectReplica2 obj2;
	
	private ObjectReplica2(){
		System.out.println("Instance created!");
	}
	
	public static ObjectReplica2 getInstance(){
		if(obj2==null){ // Lazy initialization, means it will not be created until it is called
			obj2=new ObjectReplica2();
			return obj2;
		}
		return obj2;
	}
	
}
