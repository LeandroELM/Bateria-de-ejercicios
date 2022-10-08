package bateriadeEjercicios;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int n,i;
		System.out.println("Ingrese un numero");
		n=lector.nextInt();
		i=0;
		while(n>1) {
			if((n%2)==0) {
				n=n/2;
			}else {
				n=(n*3)+1;
			}
			i=i+1;
		}
		System.out.println(i);
		lector.close();

	}

}
