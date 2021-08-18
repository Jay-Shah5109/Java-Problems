import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

interface Shape{
	public void sides();
	public void color();
}

interface LambdaNew{
	public void singleMethod();
}


public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TryCatchExample tce=new TryCatchExample();
		System.out.println(tce.testmethod());
		
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		
		List<Integer> newlist1=(List) Arrays.asList(1,4,5,5,3,32,44,64,67,43,88,96,55,45,32,11,1,4,5,6);
		
		long count_even=newlist1.stream().filter(number->number%2==0).count();

		newlist1.stream().filter(number->number%2==0).forEach(t->System.out.println(t));
		
		Optional<Integer> minimum_element=newlist1.stream().filter(number->number%2==0).min((i,j)->i.compareTo(j));

		System.out.println(count_even);
		System.out.println(minimum_element);
	
		
		
		// Using Anonymous inner class 
		Shape s=new Shape(){
			public void sides(){ 
				System.out.println("3");
			}
			public void color(){
				System.out.println("Blue");
			}
		};
		s.sides();
		
		//LambdaNew lam=
		
		
		
		

	}
	
	
	
	
	public int testmethod(){
		try{
			return 10;
		}
		catch(Exception e){
			return 100;
		}
		finally{
			return 5;
		}
	}

}
