public class BreakfastSimulator {
	public static void main(String args[]) {
		// Print out what we're doing!
		System.out.println("It's time for breakfast! What is everyone having?");
		
		// Build Ewan's breakfast: Pancakes!
		Pastry pastry1 = new Pancake();
		pastry1 = new Syrup(pastry1);
		System.out.println("\nEwan is having...");
		System.out.println("  " + pastry1.getDescription());
		System.out.println("  " + "yum ".repeat(pastry1.yumFactor()));
		
		// Build Chris's breakfast: Waffles!
		Pastry pastry2 = new Waffle();
		pastry2 = new WhippedCream(pastry2);
		pastry2 = new Strawberries(pastry2);
		System.out.println("\nChris is having...");
		System.out.println("  " + pastry2.getDescription());
		System.out.println("  " + "yum ".repeat(pastry2.yumFactor()));
	}
}