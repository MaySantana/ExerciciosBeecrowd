//Coleta de informações de um vendedor e cálculo do salário, Java
//May Santana, 2022

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String name_employee;
		double salary;
		double sales;
		
		name_employee = scan.nextLine();
		salary = scan.nextDouble();
		sales = scan.nextDouble();
		
		double aux = sales * 0.15;
		double total_salary = aux + salary;
		
		System.out.println("TOTAL = R$ " + df.format(total_salary));
		
	}
}
