package com.producerconsumer;

class Q{
	
	int num;
	boolean valueset=false;
	
	public synchronized void put(int num){
		while(valueset){
			try{
				wait();
			}catch(Exception e){};
		}
		this.num=num;
		System.out.println("Put: "+num);
		valueset=true;
		notify();
	}
	
	public synchronized void get(){
		while(!valueset){
			try{
				wait();
			}catch(Exception e){};
		}
		System.out.println("Get: "+num);
		valueset=false;
		notify();
	}
}


class Producer implements Runnable{
	
	Q q;
	
	public Producer(Q q){
		this.q=q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}

		public void run(){
			int i=0;
			while(true){
				q.put(i++);
				try{
					Thread.sleep(1000);
				}catch(Exception e){};
			}
	}
	
}

class Consumer implements Runnable{
	
	Q q;
	

	public Consumer(Q q){
		this.q=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}

		public void run(){
			while(true){
				q.get();
				try{
					Thread.sleep(1000);
				}catch(Exception e){};
			}
	}
	
}
public class ProdConsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

	}

}
