
public enum Color {
	/**
	 * lists possible color options
	 */
	RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA;
	
	/**
	 * private r variable
	 */
	private int r;
	
	/**
	 * private g variable
	 */
	private int g;
	
	/**
	 * private b variable
	 */
	private int b;
	
	/**
	 * takes given r, g, and b variables and assigns them to local r, g, and b variables
	 * @param r
	 * @param g
	 * @param b
	 */
	private Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * this allows the class to run right
	 */
	private Color() {
		
	}
	
	/**
	 * returns local r variable
	 * @return
	 */
	public int getR() {
		return r;
	}
	
	/**
	 * returns local g variable
	 * @return
	 */
	public int getG() {
		return g;
	}
	
	/**
	 * returns local b variable
	 * @return
	 */
	public int getB() {
		return b;
	}
	

}
