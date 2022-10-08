package bateriadeEjercicios;

import java.util.Scanner;

public class Programa39 {

	public static void main(String[] args) {
		int sueldo;
		Scanner lector=new Scanner(System.in);
		do{System.out.println("Bienvenido, si quiere solicitar credito, digite su sueldo");
		sueldo=lector.nextInt();}while(sueldo<=0);
		if(sueldo<=200000) {
			System.out.println("Lo sentimos, no podemos otorgar credito");
		}else {
			if(sueldo>=200000 && sueldo<500000) {
				System.out.println("Felicidades, se le otorgara un credito de 500,000C$");
			}if(sueldo>500000 && sueldo <= 1000000) {
				System.out.println("Felicidades, se le otorgara un credito de 2,000,000C$");
			}else {
				System.out.println("Lo sentimos, de momento no podemos otorgar credito a esa cantidad");
				lector.close();
			}
		}

	}

}
