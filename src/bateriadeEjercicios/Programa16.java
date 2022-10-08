package bateriadeEjercicios;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int max,min,sm,cnt;
		double media;
		System.out.println("Digite cuanto numeros ingresara");
		cnt=lector.nextInt();
		int []numeros=new int[cnt];
		sm=0;
			  for (int i = 0; i < 10; i++) {
				  System.out.println("Digite el numero "+(i+1));
				  numeros[i] = lector.nextInt(); 
			  }
			  for (int i = 0; i < 10; i++) {
				  sm= numeros[i] ;
				
			  }
			   sm=numeros[0] ;
		       max=min=numeros[0];
			  for (int i = 1; i<10 ; i++) {  
				if (numeros[i]>max) {
					   max=numeros[i];
					   
				}if(numeros[i]<min){
					   min=numeros[i];
			    }
			
		      }
			  media=sm/cnt;
			   System.out.println("El maximo es :"+max);
			   System.out.println("El minimo es :"+min);
			   System.out.println("La media es :" +media);
			   lector.close();

	}

}
