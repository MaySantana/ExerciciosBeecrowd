//Conversão de tempo, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int segundos, horas, minutos;
		
		segundos = scan.nextInt();
		
		horas = segundos/3600;
		
		segundos = segundos - horas * 3600;
		
		minutos = segundos/60;
		
		segundos = segundos - minutos * 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
	}
}
