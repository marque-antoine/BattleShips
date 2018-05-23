package fr.battleship.TestIA;
import danner.marcantoine.Battleship.*;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class TestIA {

	public static void main(String[] args) {
		int win1vs2=0;
		int win1vs3=0;
		int win2vs3=0;
		int avg=0;
		int mode[]= new int[3];
		mode[0]=3;
		FileWriter pw;
		for(int i=0;i<300;i++) { // do the csv for the 3 AI
			if(i<100) {
				mode[1]=1;
				mode[2]=2;
			}
			if(i<200) {
				mode[1]=1;
				mode[2]=3;
			}
			if(i<300) {
				mode[1]=2;
				mode[2]=3;
			}
			
			Game game=new Game(mode);
			game.getPlayerOne().placeFleet();
			game.getPlayerTwo().placeFleet();
			while(game.endGame()==true) {
				game.guess();
				game.itterateTurnsCount();
			}
			
			if(i<100) {
				(if game.winner()==game.getPlayerTwo()) {
					win1vs2=win1vs2+1;
				}
			}
			if(i<200) {
				(if game.winner()==game.getPlayerTwo()) {
					win1vs3=win1vs3+1;
				}
			}
			if(i<300) {
				(if game.winner()==game.getPlayerTwo()) {
					win2vs3=win2vs3+1;
				}				
			}
			avg=avg+(game.getTurnsCount()/2);
			
			String pwd = Paths.get("ai_proofs.csv").toAbsolutePath().normalize().toString();
			
			pw=new FileWriter(pwd);
			String Write=null;
			Write="AI n°1; scrore; AI n°2; score \n"+"Easy;"+(100-win1vs2)+"; Medium"+win1vs2+"\n"+"Easy;"+(100-win1vs3)+"; Hard"+win1vs3+"\n"+"Medium;"+(100-win2vs3)+"; Hard"+win2vs3+"\n";
			pw.write(Write);
			
		}
		pw.close();
	}

}
