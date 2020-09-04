package breakfast;

public abstract class ToppingDecorator extends Pastry {
	Pastry pastry;
	public abstract String getDescription();
	public abstract int yumFactor();
}