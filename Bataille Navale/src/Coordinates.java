
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

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
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

}
