import java.util.*;

//TODO calculer le nombre de bateaux et la vie restante

public class Fleet {
	private List<Ship> shipsInFleet;
	private Hashtable<Integer, Integer> availableShips;
	
	public void addShipFleet(Ship ship) {
		shipsInFleet.add(ship);
	}
	
	public int nbShipsAvailable() {
		int total = 0;
		Set<Integer> keys=availableShips.keySet();
		for(Integer key : keys) {
			total += availableShips.get(key);
		}
		return total;
	}
	
	public int getFirstShipAvailable() {
		Set<Integer> keys=availableShips.keySet();
		for(Integer key : keys) {
			if (availableShips.get(key)!=0) {
				return  key;
			}
		}
		return -1;
	}
	
	public Fleet() {
		shipsInFleet = new ArrayList<Ship>();
		availableShips = new Hashtable<Integer, Integer>();
		availableShips.put(1, 1);
		availableShips.put(2, 1);
		availableShips.put(3, 1);
		availableShips.put(4, 1);
		availableShips.put(5, 1);

	}
	
	public void removeAvailableShips(int key) {
		int value=availableShips.get(key);
		if(value>0) {
			availableShips.replace(key, value, value-1);
		}
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


	

}
