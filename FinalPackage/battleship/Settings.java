package battleship;

import java.util.Scanner;

public class Settings {

	public Settings() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Coordinates askPosition() {
		Scanner sc = new Scanner(System.in);
		Coordinates result=new Coordinates();
		boolean validCoordinates=false;
		while(validCoordinates==false) {
			System.out.println("Please enter a Position like B3 between A-J and 1-10");
			String coordinate=sc.nextLine();
			int length=coordinate.length();
			if(length==2 || length==3) { //We make a first check of a valid position
				if(length==2) {
					result.giveValues((int)coordinate.charAt(0)-65,(int)coordinate.charAt(1)-49);
				}
				else {
					result.giveValues((int)coordinate.charAt(0)-65, 10*(int)(coordinate.charAt(1)-48)+((int)coordinate.charAt(2)-49));
				}
				validCoordinates=result.correctCoorinates();
				if(validCoordinates=false) {
					System.out.println("Wrong coordinate, please try again");
				}
			}
			else {
				System.out.println("Wrong coordinate, please try again");
			}
			
		}
		sc.nextLine();
		return result;
	}
	
	public int[] getGameSettings() {
		Scanner scprim=new Scanner(System.in);
		int settings[]=new int[2];
		System.out.println("Please choose a game mode: 1 for Humain vs Humain, 2 for Humain vs Computer or 3 for Computer vs Spectator");
		settings[0]=scprim.nextInt();
		if(settings[0]==2 || settings[0]==3) {
			System.out.println("Now choose a Computer difficulty: 1 for easy, 2 for Medium and 3 for Hard");
			settings[1]=scprim.nextInt();
		}
		scprim.nextLine();
		return settings;
	}
}
