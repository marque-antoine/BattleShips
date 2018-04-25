
public class Ship {
	private String shipName;
	private int shipSize;
	private int shipLives;
	private boolean hittenShip;
	private boolean sinkShip;
	private Coordinates shipCoordinates;
	private Orientation shipOrientation;
	
	public class Orientation{
		
	}
	public Ship(String startCoord, String endCoord) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void ShipLength() {
	    }

	    public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

		public int getShipSize() {
		return shipSize;
	}

	public void setShipSize(int shipSize) {
		this.shipSize = shipSize;
	}

		public int getShipLives() {
		return shipLives;
	}

	public void setShipLives(int shipLives) {
		this.shipLives = shipLives;
	}

		public Coordinates getShipCoordinates() {
		return shipCoordinates;
	}

	public void setShipCoordinates(Coordinates shipCoordinates) {
		this.shipCoordinates = shipCoordinates;
	}

		public Orientation getShipOrientation() {
		return shipOrientation;
	}

	public void setShipOrientation(Orientation shipOrientation) {
		this.shipOrientation = shipOrientation;
	}

		public boolean isHittenShip() {
		return hittenShip;
	}

	public void setHittenShip(boolean hittenShip) {
		this.hittenShip = hittenShip;
	}

		public boolean isSinkShip() {
		return sinkShip;
	}

	public void setSinkShip(boolean sinkShip) {
		this.sinkShip = sinkShip;
	}

		public static final int CARRIER = 5;
	    public static final int BATTLESHIP = 4;
	    public static final int CRUISER = 3;
	    public static final int SUBMARINE = 3;
	    public static final int DESTROYER = 2;
	

}
