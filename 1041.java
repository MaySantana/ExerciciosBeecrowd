//Cálculo de coordenadas, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		double x, y;
		
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextDouble();
		y = scan.nextDouble();
		
		if (x == 0 && y == 0){
		    System.out.print("Origem\n");
		} else if (x != 0 && y == 0){
		    System.out.print("Eixo X\n");
		} else if (y != 0 && x == 0){
		    System.out.print("Eixo Y\n");
		} else if (x > 0 && y > 0){
		    System.out.print("Q1\n");
		} else if (x < 0 && y > 0){
		    System.out.print("Q2\n");
		} else if (x < 0 && y < 0){
		    System.out.print("Q3\n");
		} else if (x > 0 && y < 0){
		    System.out.print("Q4\n");
		}
	}
}
