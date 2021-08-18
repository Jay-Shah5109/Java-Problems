// Refer this video: https://www.youtube.com/watch?v=ehOvBtQdAr4


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeNew{
	
	private String name;
	private String city;
	private int id;
	
	
	public EmployeeNew(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", id=" + id + "]";
	}
	
}
public class FilterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeNew e1=new EmployeeNew("Jay","Mumbai",123);
		EmployeeNew e2=new EmployeeNew("Rahul","Mumbai",423);
		EmployeeNew e3=new EmployeeNew("Milind","Chennai",675);
		EmployeeNew e4=new EmployeeNew("Raj","Mumbai",643);
		EmployeeNew e5=new EmployeeNew("Ram","Ahmedabad",753);
		EmployeeNew e6=new EmployeeNew("Ali","Kolkata",124);
		EmployeeNew e7=new EmployeeNew("Raman","Delhi",986);
		
		
		List<EmployeeNew> mylist=new ArrayList<>();
		
		mylist.add(e1);
		mylist.add(e2);
		mylist.add(e3);
		mylist.add(e4);
		mylist.add(e5);
		mylist.add(e6);
		mylist.add(e7);
		
		// Map should include the city name as key and employee object as the value
		/*Map<String,List<EmployeeNew>> hm=new HashMap<>();
		
		Iterator itr=mylist.iterator();
		
		while(itr.hasNext()){
			EmployeeNew temp=(EmployeeNew)itr.next();
			hm.put(temp.getCity(),);
		}*/
		
		
		// Question 1 : Make a list and store the employees as value and city as key --- use grouping by clause here
		// Collect is a terminal operation
		
		Map<String,List<EmployeeNew>> hm = mylist.stream().collect(Collectors.groupingBy(EmployeeNew::getCity));
		hm.forEach((key,value)->System.out.println(key+"->"+value));
		//System.out.println(hm);
		
		// Question 2 : 
		
		List<EmployeeNew> emplist=mylist.stream().filter(s->s.getCity().equals("Mumbai")).collect(Collectors.toList());
		System.out.println("Filtering all the employees with city Mumbai");
		System.out.println(emplist);
		
		System.out.println("Priniting the hashMap elements...");
		
		Map<Integer,String> mymap=new HashMap<Integer,String>();
		
		mymap.put(1,"Jay");
		mymap.put(2,"Rahul");
		mymap.put(3,"Ganesh");
		mymap.put(4,"Ram");
		mymap.put(5,"Krishna");
		
		Iterator itr=mymap.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry mapElement=(Map.Entry)itr.next();
			int key=(Integer)mapElement.getKey();
			String value=(String)mapElement.getValue();
			System.out.println("Key: "+key+"Value: "+value);
		}
		
		
		
		
		
		
		//System.out.println(hm);
	}

}
