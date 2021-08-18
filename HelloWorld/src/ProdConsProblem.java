class Q{
	
	
	
}

class A{
	
	int num;
	
	public void put(int num){
		this.num=num;
	}
	
	public void get(){
		System.out.println(num);
	}
	
}

class MyProduce implements Runnable{
	
	Q q;

	public MyProduce(Q q) {
		this.q = q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	public void run(){
		
		int i=0;
		
		while(true){
			 
			q.put(i++);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			
			
		}
	}
}


class MyConsume implements Runnable{
	
	Q q;

	public MyConsume(Q q) {
		this.q = q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	public void run(){
		
		while(true){
			 
			System.out.println(q.get());
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			
			
		}
	}
}

public class ProdConsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread()

	}

}
