package breakfast;

public class Syrup extends ToppingDecorator {
	public Syrup(Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return pastry.getDescription() + ", Syrup";
	}
	
	public int yumFactor() {
		return 1 + pastry.yumFactor();
	}
}