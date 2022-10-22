//O maior número entre três inteiros, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int maiorAB = achaMaior(a, b);
		int maiorABC = achaMaior(maiorAB, c);
		
		System.out.println(maiorABC + " eh o maior");
		
	}
	
	public static int achaMaior(int x, int y) {
	    
	    int maior = (x + y + Math.abs(x - y))/2;
	    
	    return maior;
	    
	}
}
