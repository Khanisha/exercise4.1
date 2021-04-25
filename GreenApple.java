package Exercise4_1;

public class GreenApple extends Apple{

private String color;
 private int intake, calories;
 
 public GreenApple (String name, int q, double p, String color, int intake, int calories) {
	 super(name,q,p);
	 this.color=color;
	 this.intake=intake;
	 this.calories=calories;
 }
 
 public String getColor() {
	 return this.color;
 }
 
 public int getIntake() {
	 return this.intake;
 }
 
 public int getCalories() {
	 return this.calories;
 }
 
 public int TotalCalories() {
	 return this.calories * this.intake;
 }
 
 public double TotalPrice() {
	 return super.TotalPrice();
 }
}
