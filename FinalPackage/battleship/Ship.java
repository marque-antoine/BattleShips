package battleship;

import java.util.ArrayList;

public class Ship {
	
	///////
	//Attributs
	//////
	//private static final String[] =shipsNames = 
	private ArrayList<Coordinates> position = new ArrayList<Coordinates>();
	private int length;
	private int hitReceived = 0;
	
	
	
	public Ship(int shipLength) {
		// TODO Auto-generated constructor stub
		this.length=shipLength;
		position= new ArrayList<Coordinates>();
		hitReceived=0;
	}
	
	
	//////////
	//Getters & Setters
	//////////
	
	/**
	 * @return the position
	 */
	public ArrayList<Coordinates> getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(ArrayList<Coordinates> position) {
		this.position = position;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the hitReceived
	 */
	public int getHitReceived() {
		return hitReceived;
	}
	
	/**
	 * @param hitReceived to hitReceived+1
	 */
	public void iterateHitReceived() {
		hitReceived=hitReceived+1;
	}
	
	
	////////
	//Methods
	////////
	
	public ArrayList<Coordinates> calculShipPosition (Coordinates startPosition, Coordinates endPosition){
		ArrayList<Coordinates> shipPositions = new ArrayList<Coordinates>();
		if(startPosition.getRow() == endPosition.getRow()) { //The ship is placed horizontally
			for(int i=Math.min(startPosition.getCol(),  endPosition.getCol()) ; i<= Math.min(startPosition.getCol(),  endPosition.getCol()) + length -1; i++) {
				Coordinates newCoordinate = new Coordinates();
				newCoordinate.giveValues(i, startPosition.getCol());
				shipPositions.add(newCoordinate);
			}
		}
			else {
				for(int i=Math.min(startPosition.getRow(), endPosition.getRow());i<=Math.min(startPosition.getRow(), endPosition.getRow()) + length -1; i++) {
					Coordinates newCoordinate = new Coordinates();
					newCoordinate.giveValues(i, startPosition.getCol());
					shipPositions.add(newCoordinate);
				}
			}
		return shipPositions;
	}
	
	public boolean isHit(Coordinates coordinate) {
		boolean isHit = false;
		for(Coordinates shipCoordinates : position) {
			if (shipCoordinates.equals(coordinate)) {
				isHit = true;
			}
		}
		return isHit;
	}
	
	public boolean isSunk() {
		boolean isSunk=true;
		for (Coordinates shipCoordinates: position) {
			if (!shipCoordinates.isHit()) {
				isSunk=false;
			}
		}
		return isSunk;
	}
	
	public int isSunkNow() { //Tell you if he was already sunk, if you just sunked him or if he is still alive
		int isSunkNow=-1;
		if (this.getHitReceived()==this.getLength()) { //the ship is already sunked
			isSunkNow= 0;  
		}
		else {
			this.iterateHitReceived();
			if(this.getHitReceived() == this.getLength()) {
				isSunkNow=1;
			}
		}
		return isSunkNow;
	}
	
	public void updatePosition (Coordinates startCoordinate, Coordinates endCoordinate) {
		this.setPosition(this.calculShipPosition(startCoordinate, endCoordinate));
	}
	
	public String name() {
		return Player.shipsNames[this.getLength()-1];
	}
	
	public void setHit(Coordinates coordinate) {
		for(Coordinates coor : position) {
			if(coor.equals(coordinate)) {
				coor.setHit(true);
			}
		}
	}
	
}
