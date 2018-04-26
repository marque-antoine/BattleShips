
public class Player {
	private String playerName;
	private Fleet playerFleet;
	private Grid playerGrid;
	private int livesRemaining = 17;
	
	public Player(String playerName, Fleet playerFleet, Grid playerGrid) {
		super();
		this.playerName=playerName;
		this.playerFleet=playerFleet;
		this.playerGrid=playerGrid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the playerFleet
	 */
	public Fleet getPlayerFleet() {
		return playerFleet;
	}

	/*
	 * @param playerFleet the playerFleet to set
	 
	public void setPlayerFleet(Fleet playerFleet) {
		this.playerFleet = playerFleet;
	} 
	
	*/

	/**
	 * @return the playerGrid
	 */
	public Grid getPlayerGrid() {
		return playerGrid;
	}

	public Coordinates makeGuess() {
		return null;
		 
	}
	
	public int getPlayerShipsNumber() {
		return Fleet.getNbShipsFleet();
	}
	
	public int getRemainingShipsNumber() {
		return Fleet.getRemainingShipsNumber();
	}

	public int getPlayerLivesRemaining() {
		return livesRemaining;
	}
	
	public void placePlayerShips() {
		
	}

}
