package danner.marcantoine.Battleship;

import java.util.Scanner;

public class Settings {

	public static int[]  BattleshipSettings() {
		
		int mode[]= {0,0,0};
		Scanner scan= new Scanner(System.in);
		System.out.println("Please choose your game mode");
		System.out.println("First, choose if you want to play Humain vs Humain (1), Humain vs CPU (2) or CPU vs CPU (3)");
		String int1=scan.nextLine();
		mode[0]=(int) int1.charAt(0)-48;
		if(mode[0]==2) {
			System.out.println("Choose your AI level now: Easy (1), Medium (2), Hard (3)");
			mode[1]=(int)scan.next().charAt(1)-48;
		if(mode[0]==3) {
			System.out.println("Choose the first AI difficulty: Easy (1), Medium (2), Hard (3)" );
			mode[1]=(int)scan.next().charAt(1)-48;
			System.out.println("Now the second AI level please");
			mode[2]=(int)scan.next().charAt(2)-48;
		}
		}
		System.out.println(mode);
		return mode;
		
		// TODO Auto-generated constructor stub
	}

	public static boolean wouldLikeTocontinue() {
		Scanner sc=new Scanner(System.in);
		boolean wouldLikeToContinue=false;
		String answer=null;
		answer=sc.nextLine();
		if(answer.equals("y")) {
			wouldLikeToContinue=true;
		}
		return wouldLikeToContinue;
	}
}
