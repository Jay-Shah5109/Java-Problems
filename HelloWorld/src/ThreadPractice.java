
class ThreadJoin extends Thread{
	
	public void run(){
		
		for(int i=0;i<2;i++){
			try{
			Thread.sleep(1000);
			System.out.println("Current thread: "+Thread.currentThread().getName());
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

public class ThreadPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadJoin t1= new ThreadJoin();
		ThreadJoin t2= new ThreadJoin();
		ThreadJoin t3= new ThreadJoin();
		
		t1.start();
		try{
		t1.join();}catch(Exception e){System.out.println(e);}
		t2.start();
		try{
		t2.join();}catch(Exception e){System.out.println(e);}
		t3.start();
		try{
		t3.join();}catch(Exception e){System.out.println(e);}
		
		
		
		
		
		

	}

}
