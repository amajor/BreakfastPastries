package breakfast;

public class Sprinkles extends ToppingDecorator {
	public Sprinkles(Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return pastry.getDescription() + ", Sprinkles";
	}
	
	public int yumFactor() {
		return 5 + pastry.yumFactor();
	}
}