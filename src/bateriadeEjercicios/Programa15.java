package bateriadeEjercicios;

import java.util.Scanner;

public class Programa15 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		String clave;
		int intentos;
		System.out.println("Ingrese la clave, tiene solo 3 intentos");
		clave=lector.next();
		intentos=2;
		switch(clave) {
		case "tuani":
			System.out.println("lo conseguiste");
			System.exit(0);
			break;
		}
		do{
			System.out.println("Incorrecto, intente de nuevo, le quedan "+intentos+" intentos");
			clave=lector.next();
			switch(clave) {
			case "tuani":
				System.out.println("lo conseguiste");
				System.exit(0);
				break;
			}
			intentos=intentos-1;
			lector.close();

		}while(intentos>0);

	}

}
