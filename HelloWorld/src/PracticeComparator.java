import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
	private String name;
	private int roll;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(String name, int roll, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}
	
}


class SortbyRoll implements Comparator<Student>{
	public int compare(Student a, Student b){	
		return a.getRoll()-b.getRoll();
	}
}


class SortbyName implements Comparator<Student>{
	public int compare(Student a, Student b){	
		return a.getName().compareTo(b.getName());
	}
}

public class PracticeComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1=new Student("Jay",15,"Mumbai");
		Student s2=new Student("Rahul",1,"Punjab");
		Student s3=new Student("Virat",18,"Bangalore");
		Student s4=new Student("MS",7,"Chennai");
		Student s5=new Student("Rohit",45,"Rajasthan");
		
		List<Student> mylist=new ArrayList<Student>();
		
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		mylist.add(s4);
		mylist.add(s5);
		
		
		
		Collections.sort(mylist,new SortbyRoll());
		
		System.out.println("After sorting by roll...");
		for(Student s:mylist){
			System.out.println(s);
		}
		
		Collections.sort(mylist,new SortbyName());
		
		System.out.println("After sorting by name...");
		for(Student s:mylist){
			System.out.println(s);
		}
	}

}
