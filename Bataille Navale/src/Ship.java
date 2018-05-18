
public class Ship {

	/**
	 * @author marc-antoine
	 *
	 */
	
	private static int shipLives;
	private String shipOrientation;
	private static boolean sinkShip;
	private Coordinates startCoordinate;
	private Coordinates endCoordinate;
	
	
	public static class Carrier extends Ship {
		
		private static final int shipSize= 5;
		private String shipName= "carrier";
		
		public Carrier(Coordinates startCoordinate, Coordinates endCoordinate) {
			super(startCoordinate, endCoordinate);
			this.setShipLives(Carrier.shipSize);
		}
		
		public int getShipSize() {
			return shipSize;
		}
		
		public String getShipName() {
			return shipName;
		}
	}
	
	public static class Battleship extends Ship {
		
		private int shipSize=4;
		private String shipName="battleship";
		
		public Battleship(Coordinates startCoordinate, Coordinates endCoordinate) {
			super(startCoordinate, endCoordinate);
			this.setShipLives(Carrier.shipSize);
			
		}
		
		
		
		
		public int getShipSize() {
			return shipSize;
		}
		public String getShipName() {
			return shipName;
		}
		
	}
	
	public static class Cruiser extends Ship {
		
		private int shipSize=3;
		private String shipName="cruiser";
		
		public Cruiser(Coordinates startCoordinate, Coordinates endCoordinate) {
			super(startCoordinate, endCoordinate);
			this.setShipLives(Carrier.shipSize);
		}

		
		
		public int getShipSize() {
			return shipSize;
		}
		
		public String getShipName() {
			return shipName;
		}
		
		
	}

	public static class Submarine extends Ship {
		
		private int shipSize=2;
		private String shipName="submarine";
		
		public Submarine(Coordinates startCoordinate, Coordinates endCoordinate) {
			super(startCoordinate, endCoordinate);
			this.setShipLives(Carrier.shipSize);
		}
		
		
		public int getShipSize() {
			return shipSize;
		}
		public String getShipName() {
			return shipName;
		}		
	}
	
	public static class Destroyer extends Ship {
		
		private int shipSize=1;
		private String shipName="destroyer";
		
		public Destroyer(Coordinates startCoordinate, Coordinates endCoordinate) {
			super(startCoordinate, endCoordinate);
			this.setShipLives(Carrier.shipSize);
		}
		
		
		public int getShipSize() {
			return shipSize;
		}
		public String getShipName() {
			return shipName;
		}		
	}

		


	public static void hitShip() {
		shipLives=shipLives-1;
		
	}
	
	/**
	 * 
	 * @param shipName
	 *            define the name of the ship
	 * @param shipSize
	 *            define the size of the ship and his initial lives
	 */
	public Ship(Coordinates startCoordinate, Coordinates endCoordinate) {
		super();
		this.startCoordinate = startCoordinate;
		this.endCoordinate = endCoordinate;
	}

	// public Ship(String startCoord, String endCoord) {

	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	/**
	 * @return the startCoordinate
	 */
	public Coordinates getStartCoordinate() {
		return startCoordinate;
	}

	/**
	 * @param startCoordinate the startCoordinate to set
	 */
	public void setStartCoordinate(Coordinates startCoordinate) {
		this.startCoordinate = startCoordinate;
	}

	/**
	 * @return the endCoordinat
	 */
	public Coordinates getEndCoordinate() {
		return endCoordinate;
	}

	/**
	 * @param endCoordinate the endCoordinate to set
	 */
	public void setEndCoordinate(Coordinates endCoordinate) {
		this.endCoordinate = endCoordinate;
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
	public static boolean isSinkShip() {
		if(Ship.shipLives<1) {
			return true;
		}
		else 
			return false;
	
	}

	/**
	 * @param sinkShip the sinkShip to set
	 */
	public void setSinkShip(boolean sinkShip) {
		
	}

}
