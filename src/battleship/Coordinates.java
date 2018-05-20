package battleship;

public class Coordinates {
	
	///////////
	//attributs
	///////////
	
	private static int maxCol = 10;
	private static int maxRow = 10;
	private int col;
	private int row;
	private boolean isHit;
	
	
	public  Coordinates() {
		// TODO Auto-generated constructor stub
		this.isHit=false;
	}
	
	public Coordinates(int row, int col) {
		this.row=row;
		this.col=col;
		this.isHit=false;
	}
	
	///////////////////
	//Getters & Setters
	///////////////////

	/**
	 * @return the isHit
	 */
	public boolean isHit() {
		return isHit;
	}


	/**
	 * @param isHit the isHit to set
	 */
	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}

	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}

	/**
	 * @param col the col to set
	 */
	public void setCol(int col) {
		this.col = col;
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}

	//////////
	//Methods
	/////////
	
	public void giveValues(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public boolean correctCoorinates() {
		return this.getRow()>0 && this.getRow()<maxRow && this.getCol()>0 && this.getRow()<maxCol;
	}

	
}
