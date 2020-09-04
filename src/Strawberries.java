public class Strawberries extends ToppingDecorator {
	public Strawberries(Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return pastry.getDescription() + ", Strawberries";
	}
	
	public int yumFactor() {
		return 2 + pastry.yumFactor();
	}
}