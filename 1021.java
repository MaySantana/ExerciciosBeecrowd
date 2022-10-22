//Cálculo de notas de banco, Java
//May Santana, 2022

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double saque = scan.nextDouble();
		
		int n100;
		int n50;
		int n20;
		int n10;
		int n5;
		int n2;
		
		int n1;
		int cent50;
		int cent25;
		int cent10;
		int cent5;
		int cent1;
		
		n100 = (int) (saque / 100);
		saque -= 100 * n100;
		saque = Double.parseDouble (df.format (saque));
		
		n50 = (int) (saque / 50);
		saque -= 50 * n50;
		saque = Double.parseDouble (df.format (saque));
		
		n20 = (int) (saque / 20);
		saque -= 20 * n20;
		saque = Double.parseDouble (df.format (saque));
		
		n10 = (int) (saque / 10);
		saque -= 10 * n10;
		saque = Double.parseDouble (df.format (saque));
		
		n5 = (int) (saque / 5);
		saque -= 5 * n5;
		saque = Double.parseDouble (df.format (saque));
		
		n2 = (int) (saque / 2);
		saque -= 2 * n2;
		saque = Double.parseDouble (df.format (saque));
		
		n1 = (int) (saque / 1);
		saque -= 1 * n1;
		saque = Double.parseDouble (df.format (saque));
		
		cent50 = (int) (saque / 0.5);
		saque -= 0.5 * cent50;
		saque = Double.parseDouble (df.format (saque));
		
		cent25 = (int) (saque / 0.25);
		saque -= 0.25 * cent25;
		saque = Double.parseDouble (df.format (saque));
		
		cent10 = (int) (saque / 0.1);
		saque -= 0.1 * cent10;
		saque = Double.parseDouble (df.format (saque));
		
		cent5 = (int) (saque / 0.05);
		saque -= 0.05 * cent5;
		saque = Double.parseDouble (df.format (saque));

		cent1 = (int) (saque / 0.01);
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n", n100);
		System.out.printf("%d nota(s) de R$ 50.00\n", n50);
		System.out.printf("%d nota(s) de R$ 20.00\n", n20);
		System.out.printf("%d nota(s) de R$ 10.00\n", n10);
		System.out.printf("%d nota(s) de R$ 5.00\n", n5);
		System.out.printf("%d nota(s) de R$ 2.00\n", n2);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n", n1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", cent50);
		System.out.printf("%d moeda(s) de R$ 0.25\n", cent25);
		System.out.printf("%d moeda(s) de R$ 0.10\n", cent10);
		System.out.printf("%d moeda(s) de R$ 0.05\n", cent5);
		System.out.printf("%d moeda(s) de R$ 0.01\n", cent1);
		
	}
}
