package danner.marcantoine.Battleship;

import java.util.ArrayList;

public class Coordinates {
	
	///////////
	//attributs
	///////////
	
	private static int maxCol = 10;
	private static int maxRow = 10;
	private int col;
	private int row;
	private boolean isHit;
	private int probability;
	
	public  Coordinates() {
		// TODO Auto-generated constructor stub
		this.isHit=false;
	}
	
	public Coordinates(int row, int col) {
		this.row=row;
		this.col=col;
		this.isHit=false;
		probability=0;
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
		this.setRow(row);
		this.setCol(col);
	}
	public boolean correctCoordinates() {
		return this.getRow()>0 && this.getRow()<maxRow && this.getCol()>0 && this.getRow()<maxCol;
	}

	/**
	 * @return the probability
	 */
	public int getProbability() {
		return probability;
	}

	/**
	 * @param probability the probability to set
	 */
	public void setProbability(int probability) {
		this.probability = probability;
	}
	
	////////
	//Probability methods
	////////
	
	public ArrayList<Coordinates> getNeighbours(){
		Coordinates coor1=new Coordinates(this.row+1,this.col);
		Coordinates coor2=new Coordinates(this.row-1,this.col);
		Coordinates coor3=new Coordinates(this.row,this.col+1);
		Coordinates coor4= new Coordinates(this.row,this.col-1);
		ArrayList<Coordinates> neighbours =new ArrayList<>();
		if(coor4.correctCoordinates()) {
			neighbours.add(coor4);
		}
		if(coor3.correctCoordinates()) {
			neighbours.add(coor3);
		}
		if(coor2.correctCoordinates()) {
			neighbours.add(coor2);
		}
		if(coor1.correctCoordinates()) {
			neighbours.add(coor1);
		}
		return neighbours;
	}
	
	
	////////
	//override
	///////
	public boolean equals(Object c) {
		if(c instanceof Coordinates) {
			return (this.col==((Coordinates) c).getCol() && this.row==((Coordinates) c).getRow());
		}
		else return false;
	}
}
