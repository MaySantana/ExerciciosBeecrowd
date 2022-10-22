//Cálculo de notas de banco, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		
		int saque = scan.nextInt();
		
		int n100;
		int n50;
		int n20;
		int n10;
		int n5;
		int n2;
		
	    System.out.println(saque);
	    
	    n100 = saque/100;
	    System.out.println(n100 + " nota(s) de R$ 100,00");
	    saque = saque - saque / 100 * 100;
	    
	    n50 = saque / 50;
	    System.out.println(n50 + " nota(s) de R$ 50,00");
	    saque %= 50;
	    
	    n20 = saque / 20;
	    System.out.println(n20 + " nota(s) de R$ 20,00");
	    saque %= 20;
	    
	    n10 = saque / 10;
	    System.out.println(n10 + " nota(s) de R$ 10,00");
	    saque %= 10;
	    
	    n5 = saque / 5;
	    System.out.println(n5 + " nota(s) de R$ 5,00");
	    saque %= 5;
	    
	    n2 = saque / 2;
	    System.out.println(n2 + " nota(s) de R$ 2,00");
	    saque %= 2;
	    
	    System.out.println(saque + " nota(s) de R$ 1,00");
	    
	}
}
