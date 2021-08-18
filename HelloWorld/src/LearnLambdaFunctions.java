import java.util.function.BiConsumer;

public class LearnLambdaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnLambdaFunctions lobj=new LearnLambdaFunctions();
		lobj.add(3, 5);
		
		// now we will use lambda functions
		
		BiConsumer<Integer, Integer> bc=(a,b)->System.out.println(a+b);
		bc.accept(3, 10);
	}
	
	public void add(int a, int b){
		System.out.println(a+b);
	}

}
