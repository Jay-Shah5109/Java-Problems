import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationPractice {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Save obj= new Save();
		obj.i=4;
		
		// The below statements will create a file and append the content of the object 'obj' to the file obj.txt
		File f=new File("obj.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		// the below statements will read the object from the file obj.txt and give it to the obj1
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj1=(Save) ois.readObject(); // typecast here because we will get the object class object and we want to get it of Save Class
		
		System.out.println(obj1.i);
		
	}

}

class Save implements Serializable{
	int i;
}
