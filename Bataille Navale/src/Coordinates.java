
public class Coordinates {
	private String x;
	private String y;
	private String[][] coordinates;
	

	public Coordinates(String x, String y) {
		this.setX(x);
		this.setY(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	/**
	 * @return the coordinates
	 */
	public String[][] getCoordinates() {
		return coordinates;
	}

	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(String[][] coordinates) {
		this.coordinates = coordinates;
	}

	/**
	 * @return the x
	 */
	public String getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(String x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public String getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(String y) {
		this.y = y;
	}

}
