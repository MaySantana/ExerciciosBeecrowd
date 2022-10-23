//Quantidade de números pares em uma sequência de números, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
        int x;
        
        for (int i = 0; i < 5; i++) {
        	x = scan.nextInt();
        	if (x % 2 == 0) {
        		cont++;
        	}
        }
        
        System.out.println(cont + " valores pares");
		
    }
}
