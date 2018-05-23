package danner.marcantoine.Battleship;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc= new Scanner(System.in);
	
		String coordinate=sc.nextLine();
		int intcoordinate=(int)coordinate.charAt(0)-65;
		int int2coordinate=10*((int)coordinate.charAt(1)-48);
		int int3=(int)coordinate.charAt(2)-48;
		int ln=coordinate.length();
		System.out.println(ln);
		System.out.print(intcoordinate+"\n");
		System.out.println(int2coordinate+int3);
		System.out.println(int3);
	}
}
