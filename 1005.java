//Média Aritmética de dois números, Java
//May Santana, 2021

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a;
		double b;
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		double media = CalculoMedia(a, b);
		
		System.out.printf("MEDIA = %.5f\n", media);
		
	}
	
	public static double CalculoMedia(double a, double b){
	    
	    double media = ((a * 3.5) + (b * 7.5))/11;
	    
	    return media;
	    
	}
}
