//Tabela de Multiplicação, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for (int i = 1; i <= 10; i++){
		    int aux = i * n;
		    System.out.println(i + " x " + n + " = " + aux);
		}
	}
}
