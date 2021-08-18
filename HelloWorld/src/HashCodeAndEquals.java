
public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pen1=new Pen(10,"blue");
		Pen pen2=new Pen(10,"blue");
		
		System.out.println(pen1.equals(pen2)); // This will output false since the object memory is stored at different location
		
		

	}

}


//POJO

class Pen {

	private int price;
	private String color;

	public Pen(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}
