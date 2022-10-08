package bateriadeEjercicios;

import java.util.Scanner;

public class Programa21 {

	public static void main(String[] args) {
		int nf, sp, simb;
		Scanner lector=new Scanner(System.in);
        System.out.print("Dgite el numero de filas: ");
        nf=lector.nextInt();

        System.out.println();
        for(sp = 0,simb = (nf*1+1)-1; simb>0; sp++, simb-= 1){
            for(int i=0; i < sp; i++){
                System.out.print(" ");
            }
            for(int j=simb; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
            lector.close();	
        }
     

	}
	

}
