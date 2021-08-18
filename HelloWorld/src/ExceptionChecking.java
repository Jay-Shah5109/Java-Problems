
public class ExceptionChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=1,c;
		
		try{
			c=a/b;
			System.out.println(c);
		}catch(Exception e){
			System.out.println("Trying to divide by zero!--- Exception block");
		}
		
		Money money1=new Money(400,50);
		Money money2=new Money(400,200);

	}

}


class Money{
	int salary;
	int savings;
}