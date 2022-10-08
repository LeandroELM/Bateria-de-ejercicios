package bateriadeEjercicios;

import java.util.Scanner;

public class Programa43 {

	public static void main(String[] args) {
		ArrayList gorList=new ArrayList();
		Scanner lector=new Scanner(System.in);
		double peso, altura, PesoIdeal, a;
		String nombre, telefono;
		char respuesta;
		char s= 's' ;
		System.out.println("Bienvenidos a SeaFitYa S.A.");
		a=0;
		do {
			a=a+1;
			System.out.println("Cual es su nombre?");
			nombre=lector.next();
			System.out.println("Porfavor, ingrese su numero telefonico");
			telefono=lector.next();
			System.out.println("Cual es su altura?");
			altura=lector.nextDouble();
			System.out.println("Cual es su peso?");
			peso=lector.nextDouble();

			PesoIdeal=peso;
			if(PesoIdeal>=20) {

			}if(PesoIdeal<20 || PesoIdeal>23) {

			}if(PesoIdeal<23 || PesoIdeal>26) {
				gorList.add(
				"Nombre de cliente nº"+a+":"+nombre
				+"\nNumero de telefono:"+telefono
				+"\nAltura:"+altura
				+"\nPeso:"+peso
				+"");
			}if(PesoIdeal<26) {
				gorList.add(
				"Nombre de cliente nº"+a+":"+nombre
				+"\nNumero de telefono:"+telefono
				+"\nAltura:"+altura
				+"\nPeso:"+peso
				+"");
			}

			
			
			System.out.println("Agregara otro cliente?");
			respuesta=lector.next().charAt(0);
		}while(respuesta == s);
		System.out.print(gorList);
		lector.close();

	}

}
