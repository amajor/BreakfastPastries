package breakfast;

public class PeanutButter extends ToppingDecorator {
	public PeanutButter(Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return pastry.getDescription() + ", Peanut Butter";
	}
	
	public int yumFactor() {
		return 2 + pastry.yumFactor();
	}
}