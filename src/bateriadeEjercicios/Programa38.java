package bateriadeEjercicios;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int i,j,k,m,n;
		m=0;
		n=10;
		for (i = 0; i < n; i++) {
			   System.out.println(i);
			 for (k = 0; k <n; k++) {
				   System.out.println(k);
				   for (j= 0; j< n; j++) {
					   System.out.println(j);
					   m=m+1;
					   System.out.println(m);
					   lector.close();
				   }
			 }
		}

	}

}
