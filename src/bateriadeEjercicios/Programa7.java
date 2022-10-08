package bateriadeEjercicios;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		String mes;
		double precio, descuento, fp;
		System.out.println("Bienvenido a la tienda UNI");
		System.out.println("Cuanto va a pagar?");
		precio=lector.nextDouble();
		System.out.println("En que mes estamos?");
		mes=lector.next();
		switch(mes) {
		case "Enero":
			System.out.println("El precio final es:"+precio+"C$");
			break;
		case "Febrero":
			descuento=precio*0.15;
			fp=precio-descuento;
			System.out.println("El precio final es:"+fp+"C$");
			break;
		case "Marzo":
		case "Abril":
		case "Mayo":
		case "Junio":
		case "Julio":
		case "Agosto":
		case "Septiembre":
		case "Octubre":
		case "Noviembre":
		case "Diciembre":
			System.out.println("El precio final es:"+precio+"C$");
			break;
			
		}
           System.out.println("Gracias por su compra");
           lector.close();
	}		

	}


