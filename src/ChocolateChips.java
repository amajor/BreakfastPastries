public class ChocolateChips extends ToppingDecorator {
	public ChocolateChips(Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return pastry.getDescription() + ", Chocolate Chips";
	}
	
	public int yumFactor() {
		return 1 + pastry.yumFactor();
	}
}