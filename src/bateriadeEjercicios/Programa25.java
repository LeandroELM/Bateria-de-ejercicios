package bateriadeEjercicios;

import java.util.Scanner;

public class Programa25 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int menu, c, f;
		double r;
		System.out.println("Que desea calcular?");
		do{System.out.println("Para calcular °C -> °F ingrese 1 | Para calcular °F -> °C ingrese 2");
		menu=lector.nextInt();}while(menu<1 || menu>2);
		
		switch(menu) {
		case 1:
			System.out.println("Ingrese los °C");
			c=lector.nextInt();
			r=((c * 9/5) + 32);
			System.out.println("fahrenheit es igual a: "+r+"°F");
			break;
		case 2:
			System.out.println("Ingrese los °F");
			f=lector.nextInt();
			r=((f-32)*5/9);
			System.out.println("celsius es igual a: "+r+"°C");
			break;
			
		}
		lector.close();
	}

}
