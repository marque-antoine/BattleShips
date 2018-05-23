package battleship;
import java.util.ArrayList;

public class Player {
	////////////
	//attributs
	////////////
	private static final int nbShips = 5;
	private static final int[] shipsLengths = {2, 3, 4, 5,};
	public static final String[] shipsNames = {"Destroyer", "Submarine", "Cruiser", "Battleship", "Carrier"};
	private int numberOfHitReceived;
	private ArrayList<Coordinates> alreadyShootedCoordinates;
	
	

	public Player() {
		// TODO Auto-generated constructor stub
		numberOfHitReceived = 0;
		myFleet = new Ship[nbShips];
		alreadyShootedCoordinates = new ArrayList<Coordinates>();		
	}
	
	/////////////////////
	//Getters & Setters
	/////////////////////
	
	private Ship[] myFleet;
	/**
	 * @return the myFleet
	 */
	public Ship[] getMyFleet() {
		return myFleet;
	}

	/**
	 * @param myFleet the myFleet to set
	 */
	public void setMyFleet(Ship[] myFleet) {
		this.myFleet = myFleet;
	}

	/**
	 * @return the numberOfHitReceived
	 */
	public int getNumberOfHitReceived() {
		return numberOfHitReceived;
	}

	/**
	 * @param numberOfHitReceived the numberOfHitReceived to set
	 */
	public void setNumberOfHitReceived(int numberOfHitReceived) {
		this.numberOfHitReceived = numberOfHitReceived;
	}

	/**
	 * @return the alreadyShootedCoordinates
	 */
	public ArrayList<Coordinates> getAlreadyShootedCoordinates() {
		return alreadyShootedCoordinates;
	}

	/**
	 * @param alreadyShootedCoordinates the alreadyShootedCoordinates to set
	 */
	public void setAlreadyShootedCoordinates(ArrayList<Coordinates> alreadyShootedCoordinates) {
		this.alreadyShootedCoordinates = alreadyShootedCoordinates;
	}

	///////////////////
	//Methods
	///////////////////
	
	
	public void placeFleet() {
		Coordinates startPosition = new Coordinates();
		Coordinates endPosition = new Coordinates();
		
	}
	
	
	
	public void displayMyFleet() {
		
	}
	
	public boolean hasLost() {
		boolean hasLost=true;
		for(Ship ship : this.getMyFleet()) {
			if(ship.getLength() != ship.getHitReceived()) {
				hasLost=false;
			}
		}
		return hasLost;
	}
	
}
