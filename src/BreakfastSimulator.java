public class BreakfastSimulator {
	public static void main(String args[]) {
		// Print out what we're doing!
		System.out.println("It's time for breakfast! What is everyone having?");
		
		// Build Ewan's breakfast: Pancakes!
		Pastry pastry1 = new Pancake();
		pastry1 = new Syrup(pastry1);
		System.out.println("\nEwan is having...");
		System.out.println("  " + pastry1.getDescription());
		pastry1.printYums();
		
		// Build Chris's breakfast: Waffles!
		Pastry pastry2 = new Waffle();
		pastry2 = new WhippedCream(pastry2);
		pastry2 = new Strawberries(pastry2);
		System.out.println("\nChris is having...");
		System.out.println("  " + pastry2.getDescription());		
		pastry2.printYums();
		
		// Build Alison's breakfast: Pancakes!
		Pastry pastry3 = new Pancake();
		pastry3 = new PeanutButter(pastry3);
		pastry3 = new Syrup(pastry3);
		pastry3 = new ChocolateChips(pastry3);
		System.out.println("\nAlison is having...");
		System.out.println("  " + pastry3.getDescription());		
		pastry3.printYums();
		
		// Build Gwynnie's breakfast: Donut!
		Pastry pastry4 = new FrostedDonut();
		pastry4 = new Sprinkles(pastry4);
		System.out.println("\nGwynnie is having...");
		System.out.println("  " + pastry4.getDescription());		
		pastry4.printYums();
	}
}