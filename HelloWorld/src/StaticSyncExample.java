class TableNew{
	
	static void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){System.out.println(e);}
		}
	}
}

class MyThread5 extends Thread{
	public void run(){
		TableNew.printTable(2);
	}
}


class MyThread6 extends Thread{
	public void run(){
		TableNew.printTable(3);
	}
}


class MyThread3 extends Thread{
	public void run(){
		TableNew.printTable(3);
	}
}

class MyThread4 extends Thread{
	public void run(){
		TableNew.printTable(10);
	}
}



public class StaticSyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MyThread5 t1=new MyThread5();
		 MyThread6 t2=new MyThread6();
		 MyThread3 t3=new MyThread3();
		 MyThread4 t4=new MyThread4();
		 
		 
		 t1.run();
		 t2.run();
		 t3.run();
		 t4.run();
		 
		 

	}

}
