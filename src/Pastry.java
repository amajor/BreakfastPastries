public abstract class Pastry {
	String description = "Unknown Pastry";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int yumFactor();
	
	public void getYums() {
		System.out.println("  " + "yum ".repeat(yumFactor()));
	}
}