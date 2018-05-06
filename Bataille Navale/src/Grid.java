
public class Grid {
	
	private int height=10;
	private int width=10;
	private GridLegend[][] map;
	
	

	public Grid() {
		map=new GridLegend[height][width];
		for (int i=0;i<height;i++) {
			for (int j=0;j<width;j++) {
				map[i][j]=GridLegend.WATER;
			}
		}
	}
	
	public void addShip(Ship ship) {
		int x1 =Integer.valueOf(ship.getStartCoordinate().getxCoordinates() - 65);
		int y1=ship.getStartCoordinate().getyCoordinates()-1;//On enlève 1 car la grille commence à 0
		int x2=Integer.valueOf(ship.getEndCoordinate().getxCoordinates() - 65);
		int y2=ship.getEndCoordinate().getyCoordinates()-1;
		if(x1==x2) {
			if(y1<=y2) {
				for(int i=y1;i<=y2;i++) {
					map[x1][i]=GridLegend.SHIP;
				}
					}
				else if (y1>=y2) {
					for(int i=y2;i<=y1;i++) {
						map[x1][i]=GridLegend.SHIP;
				}
					}
			}
		else if(y1==y2) {
			if(x1<=x2){
				for(int i=x1;i<=x2;i++) {
					map[i][y1]=GridLegend.SHIP;
				}
			}
			else if (x2>=x1) {
				for(int i=x2;i<=x1;i++) {
					map[i][y2]=GridLegend.SHIP;
				}
			}
		}
		}
	
	public void drawGrid() {

		System.out.print("Voici la grille actuelle :\n  ");
		for (int j=1;j<=height;j++) {
			System.out.print(" "+ j);
		}
		System.out.print(" \n");
		for (int j=0;j<height;j++) {
			System.out.print(j+1 + "  ");
			for (int i=0;i<width;i++) {
				GridLegend square = map[i][j];
				if(square==GridLegend.FIRED) {
					System.out.print("X ");
				}
				else if (square==GridLegend.SHIP) {
					System.out.print("O ");
				}
				else if (square==GridLegend.SINKED) {
					System.out.print("@ ");
				}
				else if (square==GridLegend.WATER) {
					System.out.print("~ ");
				}
				else if (square==GridLegend.HITTEN) {
					System.out.print("0 ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static boolean emptyCoordinate() {
		boolean empty=true;
		return empty;
	}
	
	
}