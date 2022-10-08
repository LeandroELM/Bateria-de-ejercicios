package bateriadeEjercicios;

import java.util.Scanner;

public class Programa22 {

	public static void main(String[] args) {
		 int año;
   	  Scanner lector = new Scanner(System.in);
		  System.out.println("Digite el año");
		  año=lector.nextInt();
		  
		  
		if((año % 4==0) && (año % 100 !=0 || año % 400 ==0)) {
			  System.out.println("El año "+año+" es un año biciesto");
		  }
		else {
			System.out.println("El año "+año+" es no un año biciesto");
		} 
		lector.close();

	}

}
