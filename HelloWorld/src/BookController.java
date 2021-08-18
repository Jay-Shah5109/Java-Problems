import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class BookController {	
	public static void main(String[] args) {
		
		BookController bc=new BookController();
		System.out.println(bc.getBooksinSort());
	}
	public List<Book> getBooksinSort(){
		
		List<Book> books=new BookMain().getBooks();
		//MyComparator mycomparator=new MyComparator();
		
		Collections.sort(books,(b1,b2)->b2.getName().compareTo(b1.getName()));// this is lambda function , one single line code...
		return books;
	}
}
/*class MyComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		if(b1.getPages()>b2.getPages())
			return 1;
		else if(b1.getPages()<b2.getPages())		
			return -1;
		else 
			return 0;
	}*/