
public class SingletonPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new Runnable(){
			@Override
			public void run(){
				ObjectReplica4 obj4=ObjectReplica4.getInstance();
				System.out.println(obj4);
			}
		});
		
		Thread t2=new Thread(new Runnable(){
			@Override
			public void run(){
				ObjectReplica4 obj4=ObjectReplica4.getInstance();
				System.out.println(obj4);
			}
		});
		
		t1.start();
		t2.start();
		
		

	}

}

class ObjectReplica4{
	
	static ObjectReplica4 obj4;
	
	private ObjectReplica4(){
		System.out.println("Object Created!");
	}
	
	public static ObjectReplica4 getInstance(){
		if(obj4==null){ // double checked locking mechanism 1. if block 2. sync block
		synchronized (ObjectReplica4.class) {// synchronized block
			if(obj4==null){
			obj4=new ObjectReplica4(); // Advantage of synchronized block is that, all the code does not get blocked as in the 
			// synchronized method, and only some part of code that is responsible for object creation gets blocked by a thread
			// when it tries to access the method.
			return obj4;
			}
		}
		}
		return obj4;
	}
	}

	
	

