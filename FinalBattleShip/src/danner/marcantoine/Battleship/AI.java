package danner.marcantoine.Battleship;

import java.util.ArrayList;



public class AI extends Player {
	private static final int maxRow=10;
	private static final int maxCol=10;
	private int level;
	private Ship[] myFleet;
	private ArrayList<Coordinates> firstsShots;
	
	public AI(int level) {
		super();
		this.level=level;
		setFirstsShots(new ArrayList<Coordinates>());
		// TODO Auto-generated constructor stub
	}
	
	////////
	//Methods
	////////
	
	private int randomInt() {
		return (int)((Math.random()*10));
	}
	
	private Coordinates randomCoordinates() {
		Coordinates coordinates = new Coordinates();
		coordinates.giveValues(randomInt(), randomInt());
		return coordinates;
	}

	/**
	 * @return the firstsShots
	 */
	public ArrayList<Coordinates> getFirstsShots() {
		return firstsShots;
	}

	/**
	 * @param firstsShots the firstsShots to set
	 */
	public void setFirstsShots(ArrayList<Coordinates> firstsShots) {
		this.firstsShots = firstsShots;
	}
	private Coordinates possibleCoordinate(Coordinates coordinates, int length) {
		Coordinates coordinate =new Coordinates();
		int direction=randomInt();
		if(direction>5) {
			coordinate.giveValues(coordinates.getRow(), coordinates.getCol()+(length-1));
			return coordinate;
		}
		else {
			coordinate.giveValues(coordinates.getRow()+(length-1), coordinates.getCol());
			return coordinate;
		}
	}
	
	public Coordinates makeGuess(Player ennemy) {
		switch(this.level) {
		case 1: return easyMakeGuess();
		case 2: return mediumMakeGuess();
		//case 3: return hardMakeGuess();
		default : return null;
		}
	}
	
	private Coordinates easyMakeGuess() { //First AI, easy, it only play randomly
		return randomCoordinates();
	}
	
	private Coordinates mediumMakeGuess() { //Second AI, it's lke the easy one but it save the already shooted coordinates in memory

		Coordinates coordinate=new Coordinates();
		coordinate= randomCoordinates();
		while(this.getAlreadyShootedCoordinates().contains(coordinate)) {
			coordinate=randomCoordinates();
		}
		getAlreadyShootedCoordinates().add(coordinate);
		return coordinate;
	}
	
	private Coordinates hardMakeGuess() {
		return randomCoordinates();
	}
	
	
	////
	//Override
	/////
	
 	public void placeFleet() {
		Coordinates startcoordinate=new Coordinates();
		Coordinates endcoordinate= new Coordinates();
		for(int i=0;i<nbShips;i++) {
			boolean validCoordinate=false;
			myFleet[i]=new Ship(shipsLengths[i]);
			while(validCoordinate==false) {
				startcoordinate=randomCoordinates();
				endcoordinate=possibleCoordinate(startcoordinate, shipsLengths[i]);
				validCoordinate=this.checkShipPosition(myFleet[i], startcoordinate, endcoordinate);
			}
			placeShip(getMyFleet()[i],startcoordinate, endcoordinate);
		}
	}
}
