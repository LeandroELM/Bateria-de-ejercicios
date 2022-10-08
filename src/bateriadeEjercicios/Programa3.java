package bateriadeEjercicios;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int a, b, c;
		do{System.out.println("Ingrese el valor de a");
		a=lector.nextInt();}while(a<0);
		do{System.out.println("Ingrese el valor de b");
		b=lector.nextInt();}while(b<0);
		do{System.out.println("Ingrese el valor de c");
		c=lector.nextInt();}while(c<0);
		
		if(b>a && b>c) {
			System.out.println("B es el mayor de todos");
		}
		if(a>b && a>c) {
			System.out.println("A es el mayor de todos");
		}
		if(c>a && c>b) {
			System.out.println("C es el mayor de todos");
			lector.close();
		}

	}

}
