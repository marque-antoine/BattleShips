import java.util.List;

public class Fleet {
	private static int nbShipsFleet = 5;
	private static int remainingShipsNumber = nbShipsFleet;
	private List<Ship> shipsInFleet;
	
	
	

	public Fleet() {
		

	}
	

	public static void main(String[] args) {
		// TODO Auto-geneprated method stub

	}

	/**
	 * @return the playersFleet
	 */

	/**
	 * @return the shipsInFleet
	 */
	public List<Ship> getShipsInFleet() {
		return shipsInFleet;
	}

	/**
	 * @param shipsInFleet the shipsInFleet to set
	 */
	public void setShipsInFleet(List<Ship> shipsInFleet) {
		this.shipsInFleet = shipsInFleet;
	}

	/**
	 * @return the nbShipsFleet
	 */
	public static int getNbShipsFleet() {
		return nbShipsFleet;
	}

	/**
	 * @param nbShipsFleet the nbShipsFleet to set
	 */
	public void setNbShipsFleet(int nbShipsFleet) {
		Fleet.nbShipsFleet = nbShipsFleet;
	}

	/**
	 * @return the remainingShipsNumber
	 */
	public static int getRemainingShipsNumber() {
		return remainingShipsNumber;
	}

	/**
	 * @param remainingShipsNumber the remainingShipsNumber to set
	 */
	public static void setRemainingShipsNumber(int remainingShipsNumber) {
		Fleet.remainingShipsNumber = remainingShipsNumber;
	}



	

}
