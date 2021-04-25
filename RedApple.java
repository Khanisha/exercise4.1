package Exercise4_1;

public class RedApple extends Apple {
	private int weight;
	private String color;
	
	public RedApple(String name, int q, double p, int w, String c) {
		super(name,q,p);
		this.weight = w;
		this.color = c;
	}
	
	
	public int getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}
	
	public double TotalPrice() {
		return super.TotalPrice();
	}
	
	public int TotalWeight() {
		return this.weight * super.getQuantity();
	}
}
