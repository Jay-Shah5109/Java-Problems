
public class GarbageCollection {

	String obj_name;

	public GarbageCollection(String obj_name) {
		this.obj_name = obj_name;
	}
	
	static void show(){
		
		GarbageCollection g5= new GarbageCollection("G5"); // This will be cleaned after method's work is done
		display();
	}
	
	static void display(){
		GarbageCollection g6=new GarbageCollection("G6");  // This will be cleaned after method's work is done
	}
	
	public static void main(String[] args) {
		
		GarbageCollection g1= new GarbageCollection("G1");
		GarbageCollection g2= new GarbageCollection("G2");
		GarbageCollection g3= new GarbageCollection("G3");
		
		g3=null; // nullifying the reference variable ---- 1
		
		new GarbageCollection("G4"); // anonymous object creation which is not referenced anywhere ---- 2
		
		
		g2=g1; // This means that the g1 is now pointing to g2 and the object that was created in line 12 is now not 
				// referenced to anyone ----- 3
		
		show(); // garbage collection in method call, when method is called it is pushed into the stack, and when it is
		 		// done doing its work then it is popped from the stack and all the objects created into the method are 
				// destroyed at the time of popping out ---- 4
		
		System.gc();
		
	}
	
	
	@Override
	protected void finalize(){
		System.out.println(this.obj_name+" garbage collected!");
	}
	
	

}
