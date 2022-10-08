package bateriadeEjercicios;

import java.util.Scanner;

public class Programa42 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int dinero, m,q,d,c,cn,v,dz,cnc,u,n, a,b,cc,dc,e;
		System.out.println("Ingrese una cantidad de dinero");
		dinero=lector.nextInt();
		m=1000;
	    q=500;
		d=200;
		c=100;
		cn=50;
		v=20;
		dz=10;
		cnc=5;
		u=1;
		do {
		  if(dinero > 1000) {
			dinero=dinero-1000;
			a=0;
			a=a+1;
			System.out.println(a+". billete de "+m+"C$");
		  }
		  n=0;
		  if(dinero>=500 && dinero<1000) {
			  dinero=dinero-q;
			  b=0;
			  b=b+1;
			  System.out.println(b+". billete de "+q+"C$");
		  }
		  n=0;
		  if(dinero>=200 && dinero<500) {
			  dinero=dinero-d;
			  cc=0;
			  cc=cc+1;
			  System.out.println(cc+". billete de "+d+"C$");
		  }
		  n=0;
		  if(dinero>=100 && dinero<200) {
			  dinero=dinero-c;
			  dc=0;
			  dc=dc+1;
			  System.out.println(dc+". billete de "+c+"C$");
		  }
		  n=0;
		  if(dinero>=50 && dinero<100) {
			dinero=dinero-cn;
			e=0;
			e=e+1;
			System.out.println(n+". billete de "+cn+"C$");
		  }
		  n=0;
		  if(dinero>=20 && dinero<50) {
			  dinero=dinero-v;
			  n=n+1;
			  System.out.println(n+". billete de "+v+"C$");
		  }
		  n=0;
		  if(dinero>=10 && dinero<20) {
			  dinero=dinero-dz;
			  n=n+1;
			  System.out.println(n+". billete de "+dz+"C$");
		  }
		  n=0;
		  if(dinero>=5 && dinero<10) {
			  dinero=dinero-cnc;
			  n=n+1;
			  System.out.println(n+". moneda de "+cnc+"C$");
		  }
		  n=0;
		  if(dinero>=1 && dinero<5) {
			  dinero=dinero-u;
			  n=n+1;
			  System.out.println(n+". billete de "+u+"C$");
		  }
		  n=0;
		  
		  
		  
		  
		  
		  
		  
		  
		}while(dinero != 0);
		lector.close();
		

	}

}
