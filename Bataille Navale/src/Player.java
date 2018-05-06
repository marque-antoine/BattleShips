import java.util.Scanner;

public class Player {
	private String playerName;
	private Fleet playerFleet;
	private Grid playerGrid;

	
	public Player(String name) {
		playerName = name;
		playerFleet= new Fleet();
		playerGrid= new Grid();
		

	}
	
	public void placeShips() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player "+playerName+"'s turn");
		while (this.playerFleet.nbShipsAvailable()!=0) {
			int shipSize = this.playerFleet.getFirstShipAvailable();
			System.out.println("Enter position for the ship of size " + shipSize);
			System.out.println("Enter x position of the start of your ship");
			String xStartCoordinate = sc.nextLine();
			char xStartC = xStartCoordinate.toUpperCase().charAt(0);
			System.out.println("Enter y position of the start of your ship");
			String yStartCoordinate = sc.nextLine();
			int yStartC =Integer.parseInt(yStartCoordinate);
			Coordinates start = new Coordinates(xStartC, yStartC);
			System.out.println("Enter x position of the end of your ship");
			String xEndCoordinate = sc.nextLine();
			char xEndC = xEndCoordinate.toUpperCase().charAt(0);
			System.out.println("Enter y position of the end of your ship");
			String yEndCoordinate = sc.nextLine();
			int yEndC =Integer.parseInt(yEndCoordinate);	
			Coordinates end = new Coordinates(xEndC, yEndC);
			Ship ship = null;
			switch(shipSize) {
			case 1:
				ship= new Ship.Destroyer(start, end);
				break;
			case 2:
				ship= new Ship.Submarine(start, end);
				break;
			case 3:
				ship=new Ship.Cruiser(start, end);
				break;
			case 4:
				ship=new Ship.Battleship(start, end);
				break;
			case 5:
				ship=new Ship.Carrier(start, end);
				break;
			default:
				System.out.print("Erreur");
			}
			this.playerFleet.removeAvailableShips(shipSize);
			System.out.println(ship);
			this.playerFleet.addShipFleet(ship);
			this.playerGrid.addShip(ship);
			this.playerGrid.drawGrid();
			
			
		}
		
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

	/**
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
	public guessedCoordinate() 
	
	public makeGuess(/**coordonnée*/) {

			newShot();
			if (Grid.emptyCoordinate()==true) {
				System.out.println("You miss your shot, there is only water here ");
			}
			else 
				System.out.println("Nice shot, you've hit a ship");
			/**case we shot a ship*/
				Ship.hitShip();
				if (Ship.isSinkShip()==true) {
					System.out.println("Congrats you sinked a ship");
					if(Game.isOver()==true) {
						System.out.println("You won");
					}
				
				}
			
				
			
			return null;
			 
	}
	}

	
	public void placePlayerShips() {
		
	}

}
