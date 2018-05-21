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
	 * @param numberOfHitReceived the numberOfHitReceived to itterate
	 */
	public void itterateNumberOfHitReceived() {
		numberOfHitReceived=numberOfHitReceived+1;
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
	
	public Ship getShip(Coordinates guessedCoordinates) {
		Ship getShip=null;
		for (Ship ship : this.getMyFleet()) {
			for (Coordinates coordinates : ship.getPosition()) {
				if(coordinates.equals(guessedCoordinates))
					getShip=ship;
			}
		}
		return getShip;
	}
	
	public void updateCurrentPlayer(Coordinates guessedCoordinates, boolean isHit) {
		this.getAlreadyShootedCoordinates().add(guessedCoordinates);
	}
	
	public void updateSecondaryPlayer(Coordinates guessedCoordinates, boolean isHit) {
		if(isHit==true) {
			this.getShip(guessedCoordinates).setHit(guessedCoordinates);
			this.itterateNumberOfHitReceived();
		}
	}
	
	public void placeFleet() {
		Coordinates startCoordinate = new Coordinates();
		Coordinates endCoordinate = new Coordinates();
		boolean validCoordinate=false;
		for(int i=0;i<nbShips;i++) {
			myFleet[i]=new Ship(shipsLengths[i]);
			while(validCoordinate==false) {
				System.out.println("Please, place your "+shipsLengths[i]+" length "+ shipsNames[i]);
				startCoordinate=Settings.askPosition();
				endCoordinate=Settings.askPosition();
				validCoordinate=this.checkShipPosition(myFleet[i], startCoordinate, endCoordinate);
				if(validCoordinate==false) {
					System.out.println("Please enter a valid Coordinate");
				}
			}
			placeShip(myFleet[i],startCoordinate,endCoordinate);
		}
	}
	public boolean checkShipPosition (Ship ship, Coordinates startCoordinate, Coordinates endCoordinate) {
		boolean checkShipPosition=true;
		ArrayList<Coordinates> shipsPositions = ship.calculShipPosition(startCoordinate, endCoordinate);
		for(Ship s :  this.getMyFleet()) {
			if(s!=null) {
				for(Coordinates coordinate : s.getPosition()) {
					for(Coordinates testCoordinate : shipsPositions) {
						if(coordinate.equals(testCoordinate) || !testCoordinate.correctCoorinates()) {
							checkShipPosition=false;
						}
					}
				}
			}
		}
		return checkShipPosition;
	}
	public void placeShip(Ship ship, Coordinates startCoordinate, Coordinates endCoordinate) {
		ship.updatePosition(startCoordinate, endCoordinate);
	}
	
	public boolean checkGuess(Coordinates guess) {
		boolean checkGuess=false;
		for(Ship ship : this.getMyFleet()) {
			if(ship.isHit(guess)) {
				checkGuess=true;
			}
		}
		return checkGuess;
	}
	
	public Coordinates makeGuess() {
		Coordinates shootCoordinate=new Coordinates();
		shootCoordinate=Settings.askPosition();
		return shootCoordinate;
	}
	public void displayMyFleet() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				Coordinates tmp=new Coordinates(i,j);
				if(getShip(tmp)!=null) { //Cas de l'eau
					System.out.print("o");
				}
				else {
					System.out.println("-");
				}
			}
			System.out.println("\n");
		}
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
