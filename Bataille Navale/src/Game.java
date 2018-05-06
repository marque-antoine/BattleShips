
public class Game {
	private Player gameWinner;
	private Player currentPlayer;
	private Player playerOne;
	private Player playerTwo;
	
	
	public Game() {
		playerOne=new Player("Bobby");
		playerTwo=new Player("Alphonse");
		this.setCurrentPlayer(playerOne);
	}
	/**
	 * @return the gameWinner
	 */
	public Player getGameWinner() {
		return gameWinner;
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
	
	public void setup() {
		playerOne.placeShips();
		playerTwo.placeShips();
	}
	
	public void play() {
		currentPlayer.makeGuess();
		if(currentPlayer==playerOne) {
			currentPlayer=playerTwo;
		}
		else
			currentPlayer=playerOne;
	}
	
	public static boolean isOver() {
		boolean isOver=false
			if()
	}
	/**
	 * @return the currentPlayer
	 */
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	/**
	 * @param currentPlayer the currentPlayer to set
	 */
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


}
