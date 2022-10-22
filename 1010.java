//Programa sobre ler o código e o preço de um produto e o total pago, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int codProd;
		int numero_prod;
		double valor_prod;
		
		codProd = scan.nextInt();
		numero_prod = scan.nextInt();
		valor_prod = scan.nextDouble();
		
		double total1 = produto(numero_prod, valor_prod);
		
		codProd = scan.nextInt();
		numero_prod = scan.nextInt();
		valor_prod = scan.nextDouble();
		
		double total2 = produto(numero_prod, valor_prod);
		
		double total = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
	}
	
	public static double produto(int numero_prod, double valor_prod) {
		
		double total = numero_prod * valor_prod;
	    
	    return total;
	    
	}
}
