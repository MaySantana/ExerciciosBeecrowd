//Fórmula de Bhaskara, Java
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
		
		double delta = ((Math.pow(b, 2)) - 4 * a * c);
		
		if (a == 0 || delta < 0){
		    System.out.println("Impossivel calcular");
		} else {
		    double x1 = (-b + Math.sqrt(delta))/(2.0 * a);
		    double x2 = (-b - Math.sqrt(delta))/(2.0 * a);
		    
		    System.out.printf("R1 = %.5f\n", x1);
		    System.out.printf("R2 = %.5f\n", x2);
		}
	}
}
