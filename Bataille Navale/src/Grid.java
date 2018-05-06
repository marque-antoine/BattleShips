
public class Grid {
	
	private int height=10;
	private int width=10;
	private GridLegend[][] map;
	

	public Grid() {
		map=new GridLegend[height][width];
		for (int i=0;i<height;i++) {
			for (int j=0;i<width;i++) {
				map[i][j]=GridLegend.WATER;
			}
		}
	}
	
	public void addShip(Ship ship) {
		int x1 =Integer.valueOf(ship.getStartCoordinate().getxCoordinates());
		int y1=ship.getStartCoordinate().getyCoordinates();
		int x2=Integer.valueOf(ship.getEndCoordinate().getxCoordinates());
		int y2=ship.getEndCoordinate().getyCoordinates();
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
		for (int i=0;i<height;i++) {
			for (int j=0;j<width;i++) {
				GridLegend square = map[i][j];
				if(square==GridLegend.FIRED) {
					System.out.print("X");
				}
				else if (square==GridLegend.SHIP) {
					System.out.print("O");
				}
				else if (square==GridLegend.SINKED) {
					System.out.print("@");
				}
				else if (square==GridLegend.WATER) {
					System.out.print("~");
				}
				else if (square==GridLegend.HITTEN) {
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}
}