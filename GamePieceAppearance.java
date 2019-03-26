
public class GamePieceAppearance {
	
	/**
	 * private color variable
	 */
	private Color color;
	
	/**
	 * private shape variable
	 */
	private Shape shape;
	
	/**
	 * Takes color and shape variables and assigns them to the local color and shape variables
	 * @param color
	 * @param shape
	 */
	public GamePieceAppearance(Color color, Shape shape) {
		this.color = color;
		this.shape = shape;
	}
	
	/**
	 * returns color
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * returns shape
	 * @return
	 */
	public Shape getShape() {
		return shape;
	}

}
