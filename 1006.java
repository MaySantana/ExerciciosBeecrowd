//Média Ponderada de três números, Java
//May Santana, 2021

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		double media = CalculoMedia(a, b, c);
		
		System.out.printf("MEDIA = %.1f\n", media);
		
	}
	
	public static double CalculoMedia(double a, double b, double c){
	    
	    double media = ((a * 2) + (b * 3) + (c * 5))/10;
	    
	    return media;
	    
	}
}
