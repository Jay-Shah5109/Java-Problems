
public class SingletonPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new Runnable(){
			
			@Override
			public void run(){
				System.out.println(ObjectReference3.getInstance());
				
			}
		});
		
		Thread t2=new Thread(new Runnable(){
			
			@Override
			public void run(){
				System.out.println(ObjectReference3.getInstance());
			}
			
		});
		
		t1.start();
		
		t2.start();

	}

}

class ObjectReference3{
	
	static ObjectReference3 obj3;
	
	private ObjectReference3(){
		System.out.println("Object Created!!");
	}
	
	public static synchronized ObjectReference3 getInstance(){
		if(obj3==null){
			obj3=new ObjectReference3();
			return obj3;
		}
		return obj3;
	}
	
}