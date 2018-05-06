
public class Ship {

	/**
	 * @author marc-antoine
	 *
	 */
	private String shipName;
	private int shipSize;
	private int shipLives;
	private String shipOrientation;
	private boolean hittenShip;
	private boolean sinkShip;
	private Coordinates startCoordinate;
	private Coordinates endCoordinate;
	
	public class Carrier {
		
		private int shipSize= 5;
		private String shipName= "carrier";
		
		public int getShipSize() {
			return shipSize;
		}
		
		public String getShipName() {
			return shipName;
		}
	}
	
	public class Battleship {
		
		private int shipSize=4;
		private String shipName="battleship";
		
		public int getShipSize() {
			return shipSize;
		}
		public String getShipName() {
			return shipName;
		}
		
	}
	
	public class Cruiser {
		
		private int shipSize=3;
		private String shipName="cruiser";
		
		public int getShipSize() {
			return shipSize;
		}
		
		public String getShipName() {
			return shipName;
		}
		
		
	}

	public class Submarine {
		
		private int shipSize=2;
		private String shipName="submarine";
		
		public int getShipSize() {
			return shipSize;
		}
		public String getShipName() {
			return shipName;
		}		
	}
	
	public class Destroyer {
		
		private int shipSize=1;
		private String shipName="destroyer";
		
		public int getShipSize() {
			return shipSize;
		}
		public String getShipName() {
			return shipName;
		}		
	}

	public static class Orientation {
		public static final String vertical = "vertical";
		public static final String horizontal = "horizontal";
		
		public Orientation() {
			
		}
		

		
	}


	
	/**
	 * 
	 * @param shipName
	 *            define the name of the ship
	 * @param shipSize
	 *            define the size of the ship and his initial lives
	 */
	public Ship(String shipName, int shipSize, String shipOrientation, Coordinates startCoordinate, Coordinates endCoordinate) {
		super();
		this.shipName = shipName;
		this.shipSize = shipSize;
		this.shipLives = shipSize;
		this.startCoordinate = startCoordinate;
		this.endCoordinate = endCoordinate;
	}

	// public Ship(String startCoord, String endCoord) {

	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the shipName
	 */
	public String getShipName() {
		return shipName;
	}

	/*
	 * /**
	 * 
	 * @param shipName the shipName to set
	 * 
	 * public void setShipName(String shipName) { this.shipName = shipName; }
	 */

	/**
	 * @return the shipSize
	 */
	public int getShipSize() {
		return shipSize;
	}

	/**
	 * @return the shipOrientation
	 */
	public String getShipOrientation() {
		return shipOrientation;
	}

	/**
	 * @param shipOrientation
	 *            the shipOrientation to set
	 */
	public void setShipOrientation(String shipOrientation) {
		this.shipOrientation = shipOrientation;
	}

	/**
	 * @return the shipLives
	 */
	public int getShipLives() {
		return shipLives;
	}

	/*
	 * /**
	 * 
	 * @param shipLives the shipLives to set
	 * 
	 * public void setShipLives(int shipLives) { this.shipLives = shipLives; }
	 */

	/**
	 * @return the sinkShip
	 */
	public boolean isSinkShip() {
		return sinkShip;
	}

	/**
	 * @param sinkShip
	 *            the sinkShip to set
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
	 * @param hittenShip
	 *            the hittenShip to set
	 */
	public void setHittenShip(boolean hittenShip) {
		this.hittenShip = hittenShip;
	}

	
	/**
	 * @return the shipName
	 */
	public String getName() {
		return this.shipName;
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


}
