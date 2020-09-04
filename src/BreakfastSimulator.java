public class BreakfastSimulator {
	public static void main(String args[]) {
		// Print out what we're doing!
		System.out.println("It's time for breakfast! What is everyone having?");
		
		// Build Ewan's breakfast: Pancakes!
		Pastry pastry1 = new Pancake();
		System.out.println("\nEwan is having...");
		System.out.println("  " + pastry1.getDescription());
		System.out.println("  " + pastry1.yumFactor());
		
		// Build Chris' breakfast: Waffles!
		Pastry pastry2 = new Waffle();
		System.out.println("\nChris is having...");
		System.out.println("  " + pastry2.getDescription());
		System.out.println("  " + pastry2.yumFactor());
	}
}