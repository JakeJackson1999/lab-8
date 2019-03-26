
public enum GamePiece {
	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE, BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT;
	
	private GamePieceAppearance appearance;
	
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority) {
		this.appearance = appearance;
		this.priority = priority;
	}
	
	private GamePiece() {
		
	}
	
	public Color getColor() {
		return getColor();
	}
	
	public Shape getShape() {
		return getShape();
	}
	
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
	
	public String toString() {
		return String.format("%s: a %s %s with priority %d", appearance, getColor(), getShape(), priority);
	}

}
