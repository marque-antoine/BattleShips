
public class Game {
	private Player gameWinner;
	private Player gameTurn;
	private Player playerOne;
	private Player playerTwo;
	
	
	public Game() {
		playerOne=new Player();
		playerTwo=new Player();
		this.gameTurn=playerOne;
		
	}
	/**
	 * @return the gameWinner
	 */
	public Player getGameWinner() {
		return gameWinner;
	}

	/**
	 * @param gameWinner the gameWinner to set
	 */
	public void setGameWinner(Player gameWinner) {
		this.gameWinner = gameWinner;
	}

	/**
	 * @return the gameTurn
	 */
	public Player getGameTurn() {
		return gameTurn;
	}

	/**
	 * @param gameTurn the gameTurn to set
	 */
	public void setGameTurn(Player gameTurn) {
		this.gameTurn = gameTurn;
	}

	/**
	 * @return the playerOne
	 */
	public Player getPlayerOne() {
		return playerOne;
	}

	/**
	 * @param playerOne the playerOne to set
	 */
	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}

	/**
	 * @return the playerTwo
	 */
	public Player getPlayerTwo() {
		return playerTwo;
	}

	/**
	 * @param playerTwo the playerTwo to set
	 */
	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}


	public static void main(String[] args) {
		

	}
	
	public void start() {
		//System.out.println("lol");
	}


}
