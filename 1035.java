//Valores aceitos e não aceitos, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		if ( b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0){
		    System.out.println("Valores aceitos");
		} else {
		    System.out.println("Valores nao aceitos");
		}
	}
}
