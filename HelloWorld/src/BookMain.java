import java.util.*;
public class BookMain {
	
	public List<Book> getBooks(){
		List<Book> list=new ArrayList<>();
		list.add(new Book(1,"Core Java",1000));
		list.add(new Book(2,"Core Java2",3000));
		list.add(new Book(3,"Cplusplus",2000));
		list.add(new Book(1,"Core Java4",1300));
		list.add(new Book(1,"Core Java22",1040));
		list.add(new Book(1,"Core Java5",1400));
		
		return list;
		
	}
	
}
