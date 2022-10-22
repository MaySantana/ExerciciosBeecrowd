//Combustível gasto em uma viagem, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horas, velocidade;
		
		velocidade = scan.nextInt();
		horas = scan.nextInt();
		
		double combustivel = (horas * velocidade)/12.0;
		
		System.out.printf("%.3f\n", combustivel);
		
	}
}
