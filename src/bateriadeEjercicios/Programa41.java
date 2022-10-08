package bateriadeEjercicios;

import java.util.Scanner;

public class Programa41 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		double TTL,GR, GS, DS, LT;
		int menu;
		GR=32.85;
		GS=33.48;
		DS=28.45;
		System.out.println("Bienvenido a Gasolineria UNI");
		System.out.println("Que tipo de galosina usara?");
		do{System.out.println("\n1. Gasolina Regular=C$32.85 "
				+ "\n2. Gasolina Super=C$33.48 "
				+ "\n3. Diesel=C$28.45");
		menu=lector.nextInt();}while(menu<1 || menu>3);
		System.out.println("Cuantos litros comprara?");
		LT=lector.nextDouble();
		switch(menu) {
		case 1:
			System.out.println("--Gasolina Regular--");
			TTL=LT*GR;
			System.out.println("El total es de: C$"+TTL);
			break;
		case 2:
			System.out.println("--Gasolina Super--");
			TTL=LT*GS;
			System.out.println("El total es de: C$"+TTL);
			break;
		case 3:
			System.out.println("---Diesel---");
			TTL=LT*DS;
			System.out.println("El total es de: C$"+TTL);
			break;
		}
		
		
		lector.close();

	}

}
