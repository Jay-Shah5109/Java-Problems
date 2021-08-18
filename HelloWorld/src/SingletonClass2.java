// Using synchronized keyword, in a block!!! and not in a method!!!
public class SingletonClass2 {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Single1 sin=Single1.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Single1 sin=Single1.getInstance();
			}
		});
		
		t1.start();
		t2.start();
		//Single1 sin=Single1.getInstance();
		//Single1 sin1=Single1.getInstance();
		
		
		
		//System.out.println(sin);
		//System.out.println(sin1);
	}

}

class Single1{
	
	public static Single1 obj=new Single1();
	
	private Single1(){
		System.out.println("Instance created!!!");
	}
	
	public static Single1 getInstance(){
		
		if(obj==null){
			synchronized(Single1.class) // Here we have a synchronized block, which means that now the object will be
			// synchronized, but the performance will not reduce as seen before when sync was written in method definition
			{
				obj=new Single1();
			}
		}
			return obj;
	}
	
}
