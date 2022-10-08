package bateriadeEjercicios;

import java.util.Scanner;

public class Programa9 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int a;
        do{System.out.println("Digite un numero");
        a=lector.nextInt();}while(a<=0);
        if(a % 2 == 2) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
            lector.close();
        }

	}

}
