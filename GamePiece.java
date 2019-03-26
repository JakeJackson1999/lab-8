
public enum GamePiece {
	/**
	 * list possible gamePiece names
	 */
	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE, BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT;
	
	/**
	 * private appearance variable of type GamePieceAppearance
	 */
	private GamePieceAppearance appearance;
	
	/**
	 * private priority variable
	 */
	private int priority;
	
	/**
	 * takes given appearance and priority variables and set them to local appearance and priority variables
	 * @param appearance
	 * @param priority
	 */
	private GamePiece(GamePieceAppearance appearance, int priority) {
		this.appearance = appearance;
		this.priority = priority;
	}
	
	/**
	 * this allows the class to run right
	 */
	private GamePiece() {
		
	}
	
	/**
	 * returns the color 
	 * @return
	 */
	public Color getColor() {
		return getColor();
	}
	
	/**
	 * returns the shape
	 * @return
	 */
	public Shape getShape() {
		return getShape();
	}
	
	/**
	 * determines the order in which the players play by comparing the priority level of each GamePiece
	 * @param a
	 * @param b
	 * @return
	 */
	public GamePiece movesFirst(GamePiece a, GamePiece b) {
		if (a.priority < b.priority) {
			return a;
		}
		else if (a.priority > b.priority) {
			return b;
		}
		else {
			return a;
		}
	}
	
	/**
	 * returns a sentence describing the game piece, such as appearance, color, shape and its priority
	 */
	public String toString() {
		return String.format("%s: a %s %s with priority %d", appearance, getColor(), getShape(), priority);
	}

}
