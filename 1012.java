//Cálculo da Área de Figuras Planas, Java
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
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo(a, c));
		System.out.printf("CIRCULO: %.3f\n", circulo(c));
		System.out.printf("TRAPEZIO: %.3f\n", trapezio(a, b, c));
		System.out.printf("QUADRADO: %.3f\n", quadrado(b));
		System.out.printf("RETANGULO: %.3f\n", retangulo(a, b));
		
	}
	
	public static double triangulo(double a, double c) {
	    
	    double areat = (a * c)/2;
	    
	    return areat;
	    
	}
	
	public static double circulo(double c) {
	    
	    double pi = 3.14159;
	    
	    double areac = pi * (Math.pow(c, 2));
	    
	    return areac;
	    
	}
	
	public static double trapezio(double a, double b, double c){
	    
	    double areat = ((a + b)*c)/2;
	    
	    return areat;
	    
	}
	
	public static double quadrado(double b) {
	    
	    double areaq = b * b;
	    
	    return areaq;
	    
	}
	
	public static double retangulo(double a, double b){
	    
	    double arear = a * b;
	    
	    return arear;
	    
	}
}
