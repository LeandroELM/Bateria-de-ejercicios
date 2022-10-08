package bateriadeEjercicios;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int n;
		do{System.out.println("Ingrese una cantidad");
		n=lector.nextInt();}while(n<=0);
		for(int i=0;i<=n;i++) {
			i=i+1;	
			System.out.println("La primeras sumas de "+n+" es: "+i);
			lector.close();
		}

	}

}
