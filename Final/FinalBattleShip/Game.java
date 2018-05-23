package battleship;

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
	
	public void play() {
		
	}
}
