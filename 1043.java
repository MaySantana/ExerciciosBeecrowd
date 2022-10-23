//Área e Perímetro, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if ((b + c) > a && (a + c) > b && (a + b) > c){
		    
		    double perimetro = a + b + c;
		    
		    System.out.printf("Perimetro = %.1f\n", perimetro);
		    
		} else {
		    
		    double area = ((a + b)*c)/2;
		    
		    System.out.printf("Area = %.1f\n", area);
		    
		}
	}
}
