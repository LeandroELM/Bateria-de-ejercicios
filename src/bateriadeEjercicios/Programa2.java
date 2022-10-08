package bateriadeEjercicios;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int a, b;
		do{System.out.println("Ingrese el valor de a");
		a=lector.nextInt();}while(a<0);
		do{System.out.println("Ingrse el valor de b");
		b=lector.nextInt();}while(b<0);
		
		if(a > b) {
			System.out.println("El numero mayor es a="+a);
		} else {
			System.out.println("El numero mayor es b="+b);
		}
		if(a == b) {
			System.out.println("Ambos numero son iguales ");
			System.out.println("a="+a);
			System.out.println("b="+b);
			lector.close();
		}
	}

	}


