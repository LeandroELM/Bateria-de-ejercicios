package bateriadeEjercicios;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int a, b, c;
		System.out.println("Ingrese el valor de a");
		a=lector.nextInt();
		System.out.println("Ingrese el valor de b");
		b=lector.nextInt();
		System.out.println("Ingrese el valor de c");
		c=lector.nextInt();
		
		if(a<0) {
			System.out.println("Se realizara una multiplicacion, el producto de los 3 numeros es igual a:"+(a*b*c));
		}else {
			System.out.println("Se realizara una suma, el resultado es igual a:"+(a+b+c));
			lector.close();
		}

	}

}
