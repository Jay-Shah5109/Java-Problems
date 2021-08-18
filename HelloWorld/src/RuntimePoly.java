

class Car{
	
	public String enginemodel(){
		return "BS6";
	}
	
}

class Mercedes extends Car{
	
	private String name="Mercedes";
	private int price=4000000;
	private int year=2015;
	
	
	public void display(){
		System.out.println("Name: "+this.name);
		System.out.println("Price: "+this.price);
		System.out.println("Year: "+this.year);
		System.out.println("Model: "+enginemodel());
	}
	
}


public class RuntimePoly {
	
	public static void main(String[] args) {
		
		Mercedes m= new Mercedes();
		
		m.display();
		
		
	}

}
