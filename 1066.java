//Pares, Ímpares, Positivos e Negativos, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int x;
        
        for (int i = 0; i < 5; i++) {
        	x = scan.nextInt();
        	if (x % 2 == 0) contPar++;
        	else contImpar++;
        	if (x > 0) contPositivos++;
        	else if(x < 0) contNegativos++;
        }
        
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");
		
    }
}
