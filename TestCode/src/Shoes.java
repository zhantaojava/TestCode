
public class Shoes {
	int price;
	String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shoes( String name,int price) {
		super();
		this.price = price;
		this.name = name;
	}
	
}
