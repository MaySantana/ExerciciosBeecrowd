//Volume de uma esfera, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double r;
		double volume;
		double pi = 3.14159;
		
		r = scan.nextDouble();
		
		volume = (4/3.0) * pi * (Math.pow(r, 3));
		
		System.out.printf("VOLUME = %.3f\n", volume);
		
	}
}
