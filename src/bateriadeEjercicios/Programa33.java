package bateriadeEjercicios;

import java.util.Scanner;

public class Programa33 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		double Total, descuento;
		int MTMEN,MTMAT,MTSDPAD,H, salida;
		
		System.out.println("Bienvenido al colegio Mi Casita");
		do {
		    System.out.println("Digite la cantidad de hijos:");
		    H=lector.nextInt();
		
		    System.out.println("Digite el monto de la matricula a pagar:");
		    MTMAT=lector.nextInt();
		
		    System.out.println("Digite el monto de la mensualidad  de septiembre a pagar:");
		    MTMEN=lector.nextInt();
		
		    System.out.println("Digite el monto de la socidad de padres a pagar:");
		    MTSDPAD=lector.nextInt();
		    Total=H+MTMEN+MTMAT+MTSDPAD;
		    System.out.println("El total es igual a: C$"+Total);
		    
		 if(H==2) {
			descuento=(Total*0.10);
			Total=Total-descuento;
			System.out.println("Felicidades, obtuvo un descuento del 10% ");
			System.out.println("Ahora el total es de: C$"+Total);
		 }if(H==3) {
			descuento=(Total*0.15);
			Total=Total-descuento;
			System.out.println("Felicidades, obtuvo un descuento del 15% ");
			System.out.println("Ahora el total es de: C$"+Total);
		 }if(H>3) {
			descuento=(Total*0.20);
			Total=Total-descuento;
			System.out.println("Felicidades, obtuvo un descuento del 20% ");
			System.out.println("Ahora el total es de: C$"+Total);
		 }else {
			 System.out.println("Que tenga un buen dia!");
		 }
		 
		 System.out.println("Ingresara mas datos? s=1|n=0");
		 salida=lector.nextInt();
		 if(salida==0) {
			 System.exit(0);
		 }
       }while(H!=0);
		System.out.println("Eso es todo");
		lector.close();

	}

}
