package bateriadeEjercicios;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		int x;
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese el numero :");
	    x=lector.nextInt();
		for (int i = 0; i <x; i++) {
			for (int j = 0; j <4; j++) {
			  System.out.print("*");
			}
		  System.out.println("");
		}
		lector.close();

	}

}
