/**
 * 
 */

/**
 * @author marc-antoine
 *
 */
public class Coordinates {
	private int yCoordinates;
	private char xCoordinates;
	private static boolean hit = false;

	public Coordinates(char xCoordinates, int yCoordinates) {
		this.yCoordinates = yCoordinates;
		this.xCoordinates = xCoordinates;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the horizontal
	 */
	
	/**
	 * @return the hit
	 */
	public static boolean isHit() {
		return hit;
	}

	/**
	 * @param hit the hit to set
	 */
	public static void setHit(boolean hit) {
		Coordinates.hit = hit;
	}

	/**
	 * @return the yCoordinates
	 */
	public int getyCoordinates() {
		return yCoordinates;
	}

	/**
	 * @param yCoordinates the yCoordinates to set
	 */
	public void setyCoordinates(int yCoordinates) {
		this.yCoordinates = yCoordinates;
	}

	/**
	 * @return the xCoordinates
	 */
	public char getxCoordinates() {
		return xCoordinates;
	}

	/**
	 * @param xCoordinates the xCoordinates to set
	 */
	public void setxCoordinates(char xCoordinates) {
		this.xCoordinates = xCoordinates;
	}
	
	public static boolean newShot(char xCoordinate, int yCoordinate) {
		boolean newShot=true;
		return newShot;
	}
	public static boolean existableCoordinate( char xCoordinate, int yCoordinate) {
		boolean existable=true;
		return existable;
	}
}
