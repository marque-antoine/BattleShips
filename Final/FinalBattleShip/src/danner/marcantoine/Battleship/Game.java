package danner.marcantoine.Battleship;

import java.util.Scanner;

public class Game {
	/////////
	//Attributs
	/////////
	
	private Player playerOne;
	private Player playerTwo;
	private int turnsCount;

	public Game(int[] settings) {
		// TODO Auto-generated constructor stub
		settings=Settings.BattleshipSettings();
		int firstDifficulty = settings[1];
		int secondDifficulty = settings[2];
		this.turnsCount=0;
		switch(settings[0]) {
		case 1 : {
			playerOne=new Player();
			playerTwo=new Player();
			break;
		}
		
		case 2 : {
			playerOne=new Player();
			playerTwo=new AI(firstDifficulty);
			break;
		}
		case 3 : {
			playerOne=new AI(firstDifficulty);
			playerTwo=new AI(secondDifficulty);
			break;
		}
	}
	}
	
	////////////
	//Getters & Setters
	////////////
	
	
	/**
	 * @return the turnsCount
	 */
	public int getTurnsCount() {
		return turnsCount;
	}

	/**
	 * @return the itterated turns count
	 */
	public void itterateTurnsCount() {
		this.turnsCount = this.turnsCount+1;
	}

	/**
	 * @return the playerOne
	 */
	public Player getPlayerOne() {
		return playerOne;
	}

	/**
	 * @return the playerTwo
	 */
	public Player getPlayerTwo() {
		return playerTwo;
	}
	
	public Player getCurrentPlayer() {
		if(turnsCount%2==0) {
			return playerOne;
		}
		else {
			return playerTwo;
		}
	}
	
	public String getCurrentPlayerName() {
		String currentPlayerName= "Player One";
		if (getCurrentPlayer()==playerTwo) {
			currentPlayerName="Player Two";
		}
		return currentPlayerName;
	}
	public Player opponentPlayer() {
		
		if(this.getCurrentPlayer()==this.getPlayerOne()) {
			return playerOne;
		}
		else return playerTwo;
	}
	
	public Player winner() {
		Player winner=this.getCurrentPlayer();
		if(this.getCurrentPlayer().hasLost()) {
			winner=this.opponentPlayer();
		}
		return winner;
	}
	public boolean endGame() {
		boolean endgame=false;
		if( this.getCurrentPlayer().hasLost() || this.opponentPlayer().hasLost()) {
			endgame=true;
		}
		return endgame;
	}
	
	///////////////
	//Methods
	//////////////
	
	
	public String guess() {
		String toReturn=null;
		String toReturnbis=null;
		boolean result;
		Coordinates guessedCoordinates = new Coordinates();
		guessedCoordinates=this.getCurrentPlayer().makeGuess(this.opponentPlayer());
		result=this.opponentPlayer().checkGuess(guessedCoordinates);
		System.out.println(guessedCoordinates.getRow()+""+guessedCoordinates.getCol());
		Ship hittenShip=opponentPlayer().getShip(guessedCoordinates);
		int isSunk=hittenShip.isSunkNow();
		toReturn=this.getCurrentPlayerName()+" the "+hittenShip.shipName();
		if(result=true) {
			
			switch(isSunk) {
			case 0:
				toReturnbis=" is already sunked";
				break;
			case 1:
				toReturnbis=" is sunked now";
				break;
			case 2:
				toReturnbis=" is hit";
				break;
			}
			
		}
		else {
			toReturnbis="The hit is missed";
		}
		this.getCurrentPlayer().updateCurrentPlayer(guessedCoordinates, result, isSunk, hittenShip);
		this.opponentPlayer().updateSecondaryPlayer(guessedCoordinates, result);
		
		return toReturn+toReturnbis;
		
	}
	
	public static Coordinates askPosition() {
		Scanner sc = new Scanner(System.in);
		Coordinates result=new Coordinates();
		
		boolean validCoordinates=false;
		while(validCoordinates==false) {
			System.out.println("Please enter a Position");
			String coordinate=sc.nextLine();
			int length=coordinate.length();
			if(length==2 || length==3) { //We make a first check of a valid position
				if(length==2) {
					result.giveValues((int)coordinate.charAt(0)-65,(int)coordinate.charAt(1)-48);
				}
				else {
					result.giveValues((int)coordinate.charAt(0)-65, 10*((int)(coordinate.charAt(1)-48))+((int)coordinate.charAt(2))-48);
				}
				validCoordinates=result.correctCoordinates();
				if(validCoordinates=false) {
					System.out.println("Wrong coordinate, please try again");
				}
			}
			else {
				System.out.println("Wrong coordinate, please try again");
			}
			
		}
		sc.nextLine();
		return result;
	}
	

	
	
	
	
	public String playerName(Player player) {
		if(player==playerOne) {
			return "Player One";
		}
		else {
			return "Player Two";
		}
	}
}
