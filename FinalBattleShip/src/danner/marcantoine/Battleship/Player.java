package danner.marcantoine.Battleship;
import java.util.ArrayList;

public class Player {
	////////////
	//attributs
	////////////
	protected static final int nbShips = 5;
	protected static final int[] shipsLengths = {2, 3, 4, 5,};
	protected static final String[] shipsNames = {"Destroyer", "Submarine", "Cruiser", "Battleship", "Carrier"};
	private int numberOfHitReceived;
	private ArrayList<Coordinates> alreadyShootedCoordinates;

	
	
	//protected static final
	
	

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
	public void display(Player opponentPlayer) {
		displayMyFleet(opponentPlayer);
		displayEnnemyFleet(opponentPlayer);
	}
	
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
	
	public void updateCurrentPlayer(Coordinates guessedCoordinates, boolean isHit, int Sunk, Ship shipHit) {
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
		for(int i=0; i<nbShips;i++) {
			boolean validPosition=false;
			myFleet[i]=new Ship(shipsLengths[i]);
			while(validPosition==false) {
				System.out.println("Please enter the first coordinate for the "+shipsNames[i]+" with a length of "+shipsLengths[i]);
				startCoordinate=Game.askPosition();
				System.out.println("now the second coordinate please");
				endCoordinate=Game.askPosition();
				validPosition=this.checkShipPosition(myFleet[i], startCoordinate, endCoordinate);
				if(validPosition==false) {
					System.out.println("please insert a valid position");
				}
						
			}
			System.out.println("The ship has been placed");
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
						if(coordinate.equals(testCoordinate) || !testCoordinate.correctCoordinates()) {
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
		
		for(Ship ship : this.getMyFleet()) {
			if(ship.isHit(guess)) {
				return true;
			}
		}
		return false;
	}
	
	public Coordinates makeGuess(Player player) {
		Coordinates shootCoordinate=new Coordinates();
		shootCoordinate=Game.askPosition();
		return shootCoordinate;
	}
	public void displayMyFleet(Player player) {
		ArrayList<Coordinates> ennemyList = player.getAlreadyShootedCoordinates();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				Coordinates coor=new Coordinates(i,j);
				if(getShip(coor)!=null && !ennemyList.contains(coor)) {
					System.out.print("o");
				}
				if(getShip(coor)!=null && ennemyList.contains(coor)) {
					System.out.println("x");
				}
				if(getShip(coor)==null && ennemyList.contains(coor)) {
					System.out.println("@");
				}
				if (getShip(coor)==null && !ennemyList.contains(coor)) {
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
	
	public void displayEnnemyFleet(Player player) {
		System.out.println("Ennemy Grid \n");
		ArrayList<Coordinates> ennemyShipCoordinates = new ArrayList<Coordinates>();
		for(Ship ship:player.getMyFleet()) {
			for (Coordinates coordinates:ship.getPosition()) {
				ennemyShipCoordinates.add(coordinates);
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				Coordinates coor=new Coordinates(i,j);
				if(this.getAlreadyShootedCoordinates().contains(coor) && ennemyShipCoordinates.contains(coor)) {
					System.out.println("x");
				}
				if(this.getAlreadyShootedCoordinates().contains(coor) && !ennemyShipCoordinates.contains(coor)) {
					System.out.println("o");
				}
				if(!this.getAlreadyShootedCoordinates().contains(coor)) {
					System.out.println("@");
				}
			}
			System.out.println("\n");
		}
	}
}
