
public class Grid {
	
	//static int[][] grid=new int[10][10]; //Size ?
	
	private Player gridPlayer;
	private Ship gridShips; 

	public Grid() {
		
	}

	/**
	 * @return the gridPlayer
	 */
	public Player getGridPlayer() {
		return gridPlayer;
	}

	/**
	 * @param gridPlayer the gridPlayer to set
	 */
	public void setGridPlayer(Player gridPlayer) {
		this.gridPlayer = gridPlayer;
	}

	/**
	 * @return the gridShips
	 */
	public Ship getGridShips() {
		return gridShips;
	}

	/**
	 * @param gridShips the gridShips to set
	 */
	public void setGridShips(Ship gridShips) {
		this.gridShips = gridShips;
	}

}
