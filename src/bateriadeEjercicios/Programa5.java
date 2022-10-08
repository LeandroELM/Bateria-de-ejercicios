package bateriadeEjercicios;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		Double a;
		System.out.println("Ingrese el valor de a");
		a=lector.nextDouble();
		if(a<=0) {
			System.out.println("Hubo un error, cerrando en 3..2..1..");
			System.out.println("Programa terminado");
			System.exit(0);
		}else {
			System.out.println("Se calculadara la raiz cuadrada y su cuadrado");
			System.out.println("Raiz cuadrada:"+(Math.sqrt(a)));
			System.out.println("El cuadrado es:"+(Math.pow(a, 2)));
			lector.close();
		}

	}

}
