import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
	 
	private String fname,lname,dept;
	
	

	public Employee1(String fname, String lname, String dept) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee1 [fname=" + fname + ", lname=" + lname + ", dept=" + dept + "]";
	}




	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
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
		Employee1 other = (Employee1) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}
	
	
	
	
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee1> list = new ArrayList<>();
		List<Employee1> newlist = new ArrayList<>(); 
		//e1,e2,e3 --> 1000,2000,3000
		Employee1 e1=new Employee1("jay","shah","Computers",);
		Employee1 e2=new Employee1("jayesh","mehta","extc");
		Employee1 e3=new Employee1("virat","kohli","Electronics");
		Employee1 e4=new Employee1("rahul","mehta","extc");
		Employee1 e5=new Employee1("ravi","rajan","it");
		Employee1 e6=new Employee1("suyash","desai","it");
		Employee1 e7=new Employee1("samir","dravid","Computers");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		
		
		Map<Employee1,Integer> hm = new HashMap<>();
		hm.put(e1,1000);
		hm.put(e2,2000);
		hm.put(e3,3000);
		Integer integermine=hm.get(e3);
		System.out.println(integermine);
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
			Employee1 enew=(Employee1)itr.next();
			if(enew.getFname().equals("jay")){
				newlist.add(enew);
			}
		}
		
		for(Employee1 e:newlist){
			System.out.println(e);
		}
	
		
		list.stream().filter(e->e.getFname()=="jay").forEach(s->System.out.println(s));
		
		
		
		System.out.println("---------");
		List<Employee1> nl=list.stream().filter(e->e.getDept()=="extc").collect(Collectors.toList());
		System.out.println(nl);
		
		Employee1 n2=list.stream().filter(e->{if(e.getDept().equals("Computers") && e.getLname().equals("shah")){return true;}else return false;}).findAny().orElse(null);
		System.out.println(n2);
		
		System.out.println("---------");
		list.stream().filter(e->{if(e.getDept().equals("extc") && e.getLname().equals("mehta")){return true;}else return false;}).forEach(s->System.out.println(s));

	}

}
