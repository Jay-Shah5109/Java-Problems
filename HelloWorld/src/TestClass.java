import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class MyPen{
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public MyPen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPen other = (MyPen) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPen p1= new MyPen("Lexi",10);
		MyPen p2= new MyPen("Reynolds",15);
		MyPen p3= new MyPen("Lexi", 10);
		
		System.out.println(p1.equals(p3));
		
		List<String> newlist=new LinkedList<>();
		
		newlist.add("apple");
		newlist.add("apple1");
		newlist.add("apple2");
		newlist.add("apple332");
		newlist.add("apple42");
		
		
		List<Integer> counter=newlist.stream().map(s->s.length()).collect(Collectors.toList());
		
		System.out.println(counter);
		
		
		

	}

}
