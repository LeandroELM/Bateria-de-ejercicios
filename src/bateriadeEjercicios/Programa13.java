package bateriadeEjercicios;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		  int num, res,total, i;
		  System.out.println("Ingrese un numero");
		  num=lector.nextInt();
		  res=0;
		  total=2*num;
		  for(i=0; i<=total;i=i+2) {
			  res=res+i;
			  System.out.println(i);
			  lector.close();
		  }
		  System.out.println(res);
		  
		  

	}

}
