//Menu de Tipos de Combustível, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		int X = 0, fuel = 0, customerAlcohol = 0, customerGasoline = 0, customerDiesel = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (X != 4) {
			X = input.nextInt();
			if (X == 1) {
				customerAlcohol+=1;
			}else if (X == 2) {
				customerGasoline += 1;
			}else if (X == 3) {
				customerDiesel += 1;
			}
		}
		
		System.out.print("MUITO OBRIGADO\n");
		System.out.print("Alcool: " + customerAlcohol + "\n");
		System.out.print("Gasolina: " + customerGasoline + "\n");
		System.out.print("Diesel: " + customerDiesel + "\n");
		
	}
}
