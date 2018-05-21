package battleship;

import java.util.Scanner;

public class Game {
	/////////
	//Attributs
	/////////
	
	private Player playerOne;
	private Player playerTwo;
	private int turnsCount;

	public Game(int difficulty, int mode) {
		// TODO Auto-generated constructor stub
		this.turnsCount=0;
		switch(mode) {
		case 1 : {
			playerOne=new Player();
			playerTwo=new Player();
			break;
		}
		
		case 2 : {
			playerOne=new Player();
			playerTwo=new AI(difficulty);
			break;
		}
		case 3 : {
			playerOne=new AI(difficulty);
			playerTwo=new AI(difficulty);
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
		Player player = playerTwo;
		if(this.getCurrentPlayer()==this.getPlayerOne()) {
			player=playerOne;
		}
		return player;
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
	public static void main(String[] args) {
		int mode[]=getGameSettings();
		Game game= new Game(mode[0], mode[1]);
		//We initialize ships
		game.getPlayerOne().placeFleet();
		game.getPlayerTwo().placeFleet();
		//We display the ships
		game.getPlayerOne().displayMyFleet();
		game.getPlayerTwo().displayMyFleet();
		
		while (!(game.endGame())) {
			System.out.println(game.getTurnsCount());
			System.out.println(game.getCurrentPlayerName());
			//Settings.displayPlayer(game.getCurrentPlayer());
			System.out.println(game.getCurrentPlayerName()+" please make a guess");
			String print=game.guess();
			System.out.println(print);
			game.itterateTurnsCount();
		}
		System.out.println(game.winner()+ " wins");
	}
	
	public String guess() {
		String toReturn=null;
		String toReturnbis=null;
		boolean result;
		Coordinates guessedCoordinates = new Coordinates();
		guessedCoordinates=this.getCurrentPlayer().makeGuess();
		result=this.opponentPlayer().checkGuess(guessedCoordinates);
		System.out.println(guessedCoordinates.getRow()+""+guessedCoordinates.getCol());
		this.getCurrentPlayer().updateCurrentPlayer(guessedCoordinates, result);
		this.opponentPlayer().updateSecondaryPlayer(guessedCoordinates, result);
		if(result=true) {
			Ship hittenShip=opponentPlayer().getShip(guessedCoordinates);
			int isSunk=hittenShip.isSunkNow();
			toReturn=this.getCurrentPlayerName()+" the "+hittenShip.name();
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
		return toReturn+toReturnbis;
		
	}
	
	public static Coordinates askPosition() {
		Scanner sc = new Scanner(System.in);
		Coordinates result=new Coordinates();
		boolean validCoordinates=false;
		while(validCoordinates==false) {
			System.out.println("Please enter a Position like B3 between A-J and 1-10");
			String coordinate=sc.nextLine();
			int length=coordinate.length();
			if(length==2 || length==3) { //We make a first check of a valid position
				if(length==2) {
					result.giveValues((int)coordinate.charAt(0)-65,(int)coordinate.charAt(1)-49);
				}
				else {
					result.giveValues((int)coordinate.charAt(0)-65, 10*(int)(coordinate.charAt(1)-48)+((int)coordinate.charAt(2)-49));
				}
				validCoordinates=result.correctCoorinates();
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
	
	public static int[] getGameSettings() {
		Scanner scprim=new Scanner(System.in);
		int settings[]=new int[2];
		System.out.println("Please choose a game mode: 1 for Humain vs Humain, 2 for Humain vs Computer or 3 for Computer vs Spectator");
		settings[0]=scprim.nextInt();
		if(settings[0]==2 || settings[0]==3) {
			System.out.println("Now choose a Computer difficulty: 1 for easy, 2 for Medium and 3 for Hard");
			settings[1]=scprim.nextInt();
		}
		scprim.nextLine();
		return settings;
	}
	
	public static void displayPlayer(Player player) {
		
	}
}
