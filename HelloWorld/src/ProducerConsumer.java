class Q{
	
	int num=0;
	boolean valueSet=false;
	
	public synchronized void put(int num){
		while(valueSet){
			try{wait();}catch(Exception e){ //Golden Rule: Whenever we use wait method, the method in which wait is called should be synchronized
			}
		}
		System.out.println("Put: "+num);
		valueSet=true; // set the value to true when value is incremented once
		this.num=num;
		notify();// this will notify the consumer thread
	}
	
	public synchronized void get(){
		while(!valueSet){
			try{wait();}catch(Exception e){
			}
		}
		System.out.println("Get: "+num);
		valueSet=false;
		notify();// this will notify the producer thread
	}
}


class Producer implements Runnable{
	
	Q q;

	public Producer(Q q) {
		//super();
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
			}catch(Exception e){}
		}	// this will change the value of num everytime it will run, it will affect in the class Q
			// assign the value here
		}
	}



class Consumer implements Runnable{
	
	Q q;

	public Consumer(Q q) {
		//super();
		this.q = q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	public void run(){
		while(true){
			q.get(); // Get the value here
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q= new Q();
		new Producer(q);
		new Consumer(q);

	}

}
