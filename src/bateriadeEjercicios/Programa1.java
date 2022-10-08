package bateriadeEjercicios;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int a, b;
		System.out.println("Digite el valor de A");
		a=lector.nextInt();
		System.out.println("Digite el valor de B");
		b=lector.nextInt();
		System.out.println("A tiene el valor de:"+a);
		System.out.println("B tiene el valor de:"+b);
		System.out.println("----------------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A tiene el valor de:"+a);
		System.out.println("B tiene el valor de:"+b);
		lector.close();
	}

	}


