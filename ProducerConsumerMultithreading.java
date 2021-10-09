//import java.util.Queue;


class Queue{
	
	int n=0;
	boolean flag=false;
	
	public synchronized void put(int n){
		while(flag){
			try{
				wait();
			}catch(Exception e){
				
			}
		}
		System.out.println("PUT:"+n);
		flag=true;
		this.n=n;
		notify();
	}
	
	public synchronized void get(){
		while(!flag){
			try{
				wait();
			}catch(Exception e){
				
			}
		}
		System.out.println("GET:"+n);
		flag=false;
		notify();
	}
	
	
}

class Producer1 implements Runnable{
	
	Queue q;
	
	public Producer1(Queue q){
		
		this.q=q;
		Thread t=new Thread(this, "Producer1");
		t.start();
	}
	
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
			try{
				Thread.sleep(1500);
			}
			catch(Exception e){
				
			}
		}
	}
	
}


class Consumer1 implements Runnable{
	
	Queue q;
	
	public Consumer1(Queue q){
		this.q=q;
		Thread t=new Thread(this,"Consumer1");
		t.start();
	}
	
	public void run(){
		while(true){
		q.get();
		try{
			Thread.sleep(1500);
		}catch(Exception e){
			
		}
		}
	}
	
}



public class ProducerConsumerMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue();
		new Producer1(q);
		new Consumer1(q);

	}

}
