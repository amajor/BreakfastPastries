public class WhippedCream extends ToppingDecorator {
	public WhippedCream(Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return pastry.getDescription() + ", Whipped Cream";
	}
	
	public int yumFactor() {
		return 2 + pastry.yumFactor();
	}
}