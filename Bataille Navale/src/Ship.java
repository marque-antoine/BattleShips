
public class Ship {
	private String shipName;
	private int shipSize;
	private int shipLives;
	private boolean hittenShip;
	private boolean sinkShip;
	private Coordinates shipCoordinates;
	private Orientation shipOrientation;
	
	private class Carrier {
		//this.shipSize=5; 
	}
	
	private class BattleShip {
		
	}
	
	private class Cruiser {
		
	}
	
	private class Submarine  {
		
	}
	
	private class Destroyer {
		
	}
	public Ship(String startCoord, String endCoord) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the shipName
	 */
	public String getShipName() {
		return shipName;
	}

	/**
	 * @param shipName the shipName to set
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	/**
	 * @return the shipSize
	 */
	public int getShipSize() {
		return shipSize;
	}

	/**
	 * @param shipSize the shipSize to set
	 */
	public void setShipSize(int shipSize) {
		this.shipSize = shipSize;
	}

	/**
	 * @return the shipOrientation
	 */
	public Orientation getShipOrientation() {
		return shipOrientation;
	}

	/**
	 * @param shipOrientation the shipOrientation to set
	 */
	public void setShipOrientation(Orientation shipOrientation) {
		this.shipOrientation = shipOrientation;
	}

	/**
	 * @return the shipLives
	 */
	public int getShipLives() {
		return shipLives;
	}

	/**
	 * @param shipLives the shipLives to set
	 */
	public void setShipLives(int shipLives) {
		this.shipLives = shipLives;
	}

	/**
	 * @return the sinkShip
	 */
	public boolean isSinkShip() {
		return sinkShip;
	}

	/**
	 * @param sinkShip the sinkShip to set
	 */
	public void setSinkShip(boolean sinkShip) {
		this.sinkShip = sinkShip;
	}

	/**
	 * @return the hittenShip
	 */
	public boolean isHittenShip() {
		return hittenShip;
	}

	/**
	 * @param hittenShip the hittenShip to set
	 */
	public void setHittenShip(boolean hittenShip) {
		this.hittenShip = hittenShip;
	}

	/**
	 * @return the shipCoordinates
	 */
	public Coordinates getShipCoordinates() {
		return shipCoordinates;
	}

	/**
	 * @param shipCoordinates the shipCoordinates to set
	 */
	public void setShipCoordinates(Coordinates shipCoordinates) {
		this.shipCoordinates = shipCoordinates;
	}
	
	/**
	 * @return the shipName
	 */
	public String getName(){
		return this.shipName;
	}
	
	public int getSize() {
		return 0;
	}

		/*public static final int CARRIER = 5;
	    public static final int BATTLESHIP = 4;
	    public static final int CRUISER = 3;
	    public static final int SUBMARINE = 3;
	    public static final int DESTROYER = 2;*/
	

}
