//Cálculo de ano(s), mes(es) e dia(s), Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade, ano, meses;
		
		idade = scan.nextInt();
		
		ano = idade/365;
		
		idade = idade - 365 * ano;
		
		meses = idade/30;
		
		idade = idade - 30 * meses;
		
		System.out.println(ano + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(idade + " dia(s)");
	}
}
