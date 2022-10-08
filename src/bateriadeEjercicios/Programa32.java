package bateriadeEjercicios;

import java.util.Scanner;

public class Programa32 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
        int n1, n2, mcd;
		do{System.out.println("Digite el primer numero");
		n1=lector.nextInt();}while(n1<=0);
		do{System.out.println("Digite el segundo numero");
		n2=lector.nextInt();}while(n2<=0);
        mcd=1;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                mcd = i;
        }
 
        System.out.printf("El MCD de "+n1+" y de "+n2+" es "+mcd);
        lector.close();

	}

}
