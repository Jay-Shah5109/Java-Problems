package com.streamslearn.generics;

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
		System.out.println("PUT: "+num);
		valueset=true;
		notify();
		
	}
	
	public synchronized void get(){
		while(!valueset){
			try{
				wait();
			}catch(Exception e){};
		}
		System.out.println("GET: "+num);
		valueset=false;
		notify();
	}
	
}

class Producer implements Runnable{
	Q q;
	public Producer(Q q){
		this.q=q;
		Thread tproducer=new Thread(this,"Producer");
		tproducer.start();
	}
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
			try{
				Thread.sleep(500);
			}catch(Exception e){};
		}
	}
}

class Consumer implements Runnable{
	Q q;
	public Consumer(Q q){
		this.q=q;
		Thread tconsumer=new Thread(this,"Consumer");
		tconsumer.start();
	}
	public void run(){
		while(true){
			q.get();
			try{
				Thread.sleep(500);
			}catch(Exception e){};
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q= new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
	}
}
