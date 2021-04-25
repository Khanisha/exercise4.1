package Exercise4_1;

public class main {

	public static void main(String[] args) {
	
		Fruit objfruit = new Fruit ("Fruitty");
		Apple objapple = new Apple ("Apple", 3, 0.90);
		RedApple objredapple = new RedApple("Honeycrisp", 2, 1.50, 30,"RED");
		GreenApple objgreenapple = new GreenApple ("Crispin", 3, 1.45,"GREEN",98,20);
		
		System.out.println();
		
		System.out.printf("The Price of Apples are : RM" + objapple.TotalPrice());
		System.out.println();
		
		System.out.println("-REDAPPLE-");
		System.out.printf("Total Price : RM" + objredapple.TotalPrice());
		System.out.println();
		System.out.printf("Total Weight:" + objredapple.TotalWeight() + "g");
		System.out.println();
		
		System.out.println("-GREENAPPLE-");
		System.out.printf("Total Price : RM" + objgreenapple.TotalPrice());
		System.out.println();
		System.out.printf("Total Calorie Per Intake: " + objgreenapple.TotalCalories() + "kcal");
	}

}
