package danner.marcantoine.Battleship;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner scan= new Scanner(System.in);
		boolean wouldLikeToPLay=true;
		int mode[]=Settings.BattleshipSettings();
		while(wouldLikeToPLay==true) {
			
			Game game = new Game(mode);
			
			System.out.println(game.getCurrentPlayerName() + " it's your turn");
			System.out.println("Please enter your starting coordinate and then your end coordinate" );
			game.getPlayerOne().placeFleet();
			System.out.println(game.playerName(game.opponentPlayer()) + " PLease place your fleet");
			System.out.println("To place a ship, you will need to type in a starting coordinate, then  the ending coordinates" );
			game.getPlayerTwo().placeFleet();

			while(!(game.endGame())) {
				System.out.println(game.getTurnsCount());
				System.out.println("It's "+game.getCurrentPlayerName() + " Turn"+game.getTurnsCount());
				//game.getCurrentPlayer().print(game.opponent());
				System.out.println(game.getCurrentPlayerName() + " please make a guess");
				String toPrint = game.guess();
				System.out.println(toPrint);
				game.itterateTurnsCount();
			}
			System.out.println(game.playerName(game.winner())+" wins the game in"+(game.getTurnsCount()/2)+"turn");
			System.out.println("Want to play again? y/n");
			wouldLikeToPLay = Settings.wouldLikeTocontinue();
			
			//change the player
			int tmp=mode[1];
			mode[1]=mode[2];
			mode[2]=tmp;
			
		}
		scan.close();
	}
	
	
	        
}
