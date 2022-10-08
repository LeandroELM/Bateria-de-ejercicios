package bateriadeEjercicios;

import java.util.Scanner;

public class Programa28 {

	public static void main(String[] args) {
		 Scanner lector = new Scanner(System.in);
	        int a, b, n;
	        b=0;
	        n=0;
			for(int i =10;i >= 0;i--) {
		        System.out.print("Digite un numero ");
		        a=lector.nextInt();
		        if(a % 2 == 0) {
		            System.out.println(a+" es par ");
		        } else {
		            System.out.println(a+" es impar");
		            b=a+b;
		            a=b;
		            n=n+1;
		        }
			}
			n=n-1;
			System.out.println("El valor medio de los impares es:"+(b/n));
			lector.close();

	}

}
