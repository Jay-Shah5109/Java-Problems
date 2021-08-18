
public class MultithreadingPractice {
	
	int n=1;
	final int MAX=20;
	
	public void printEven(){
		synchronized(this){
			while(n<MAX){
				if(n%2==1){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Thread prints: "+n);
				n++;
				notify();
			}
			
		}
	}
	
	public void printOdd(){
		synchronized(this){
			while(n<MAX){
				if(n%2==0){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Thread prints: "+n);
				n++;
				notify();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int hashCode(){	
			
		}
		
		String s="Jay";
		s.concat("Shah");
		System.out.println(s);
		String s1=new String("Jay");
		System.out.println(s1);
		s1.
		
		MultithreadingPractice multi=new MultithreadingPractice();
		Thread printodd=new Thread(new Runnable(){
			public void run(){
				multi.printOdd();
			}
		}); // will access the odd class
		Thread printeven=new Thread(new Runnable(){
			public void run(){
				multi.printEven();
			}
		}); // will access the even class
		
		printodd.start();
		printeven.start();
	}

}
//Below is written just to understand the new ways of writing the comparator inetface.
//Collections.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
