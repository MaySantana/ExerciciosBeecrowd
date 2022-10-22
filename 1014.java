//Consumo de combustível de um carro, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int distancia;
		double combustivel;
		
		distancia = scan.nextInt();
		combustivel = scan.nextDouble();
		
		double consumo = distancia/combustivel;
		
		System.out.printf("%.3f km/l\n", consumo);
		
	}
}
