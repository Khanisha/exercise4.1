package Exercise4_1;

public class Apple extends Fruit {

private int quantity; 
private double price;

	
	public Apple (String name, int q, double p) {
		super(name);
		System.out.println(name);
		
		this.quantity = q;
		this.price = p;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
	public double TotalPrice() {
		return this.price * this.quantity;
	}
	
}
