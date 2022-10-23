//Soma de todos os valores ímpares, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		int a, b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a < b) {
			for (int i = a + 1; i < b; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i= b + 1; i < a; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
    
		System.out.println(soma);
    
    }
}
